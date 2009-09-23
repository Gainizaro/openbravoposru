//    Openbravo POS is a point of sales application designed for touch screens.
//    Copyright (C) 2007-2009 Openbravo, S.L.
//    http://www.openbravo.com/product/pos
//
//    This file is part of Openbravo POS.
//
//    Openbravo POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    Openbravo POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with Openbravo POS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.pos.sql;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.JFrame;
import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.JMessageDialog;
import com.openbravo.data.gui.MessageInf;
import com.openbravo.data.loader.Session;
import com.openbravo.pos.forms.*;
import com.openbravo.pos.printer.DeviceTicket;
import com.openbravo.pos.scale.DeviceScale;
import com.openbravo.pos.scanpal2.DeviceScanner;
import com.openbravo.pos.mercury130.DeviceMercury130;

public class JFrmSQL extends javax.swing.JFrame implements AppView {
    
    private AppProperties m_props;
    private Session session;        
    private JPanelSQL sql;
    
    /** Creates new form JFrmSQL */
    public JFrmSQL() {
    }
    
    private boolean start(AppProperties props) {        
        
        m_props = props;
        
        initComponents();
        
        try {
            session = AppViewConnection.createSession(props);
        } catch (BasicException e) {
            JMessageDialog.showMessage(this, new MessageInf(MessageInf.SGN_DANGER, e.getMessage(), e));
            return false;
        }        

        addWindowListener(new MyFrameListener()); 
        
        sql = new JPanelSQL(this);       
        getContentPane().add(sql, BorderLayout.CENTER);
        
        try {
            sql.activate(); 
        } catch (BasicException e) { // never thrown ;-)
        }
        
        setVisible(true);
        
        return true;
    }
    
    private class MyFrameListener extends WindowAdapter{
        
        public void windowClosing(WindowEvent evt) {
            sql.deactivate();
            session.close();
            dispose();
        }
        public void windowClosed(WindowEvent evt) {
            System.exit(0);
        }
    }
    
    public DeviceScale getDeviceScale() {
        return null;
    }
    
    public DeviceScanner getDeviceScanner() {
        return null;
    }

    public DeviceMercury130 getDeviceMercury130() {
        return null;
    }

    public DeviceTicket getDeviceTicket() {
        return null;
    }

    public String getActiveCashIndex() {
        return null;
    }
    public Date getActiveCashDateStart() {
        return null;
    }
    public int getActiveCashSequence() {
        return 0;
    }
    public Date getActiveCashDateEnd(){
        return null;
    }
    public String getInventoryLocation() {
        return null;
    }

    public void setActiveCash(String value, int iSeq, Date dStart, Date dEnd) {
    }


    public Session getSession() {
        return session;
    }
    
//    public DataSource getDataSource() {
//        return m_appcnt.getDataSource();
//    }
    
    public AppProperties getProperties() {
        return m_props;
    }

    public Object getBean(String beanfactory) throws BeanFactoryException {
        return null;
    }
     
    public JFrame getFrame() {
        return this;
    }    
    public void waitCursorBegin() {
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
    }
    public void waitCursorEnd() {
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

    public AppUserView getAppUserView() {
        return null;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-706)/2, (screenSize.height-369)/2, 706, 369);
    }
    // </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
//                try {
//                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//                    // UIManager.setLookAndFeel("com.shfarr.ui.plaf.fh.FhLookAndFeel");
//                    // UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//                } catch(Exception ex) {
//                }
                
                AppConfig config = new AppConfig(args);
                config.load();
                
                if (!new JFrmSQL().start(config)) {
                    // No se ha iniciado correctamente, entonces nos vamos disgustados.
                    System.exit(1);
                }  
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
