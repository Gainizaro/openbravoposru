@echo off

REM    Openbravo POS is a point of sales application designed for touch screens.
REM    Copyright (C) 2008-2009 Openbravo, S.L.
REM    http://sourceforge.net/projects/openbravopos
REM
REM    This file is part of Openbravo POS.
REM
REM    Openbravo POS is free software: you can redistribute it and/or modify
REM    it under the terms of the GNU General Public License as published by
REM    the Free Software Foundation, either version 3 of the License, or
REM    (at your option) any later version.
REM
REM    Openbravo POS is distributed in the hope that it will be useful,
REM    but WITHOUT ANY WARRANTY; without even the implied warranty of
REM    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
REM    GNU General Public License for more details.
REM
REM    You should have received a copy of the GNU General Public License
REM    along with Openbravo POS.  If not, see <http://www.gnu.org/licenses/>.

set DIRNAME=%~dp0

set CP="%DIRNAME%openbravopos.jar"

set CP=%CP%;"%DIRNAME%lib/jasperreports-4.1.1.jar"
set CP=%CP%;"%DIRNAME%lib/jcommon-1.0.16.jar"
set CP=%CP%;"%DIRNAME%lib/jfreechart-1.0.13.jar"
set CP=%CP%;"%DIRNAME%lib/jdt-compiler-3.1.1.jar"
set CP=%CP%;"%DIRNAME%lib/commons-beanutils-1.8.3.jar"
set CP=%CP%;"%DIRNAME%lib/commons-digester-1.7.jar"
set CP=%CP%;"%DIRNAME%lib/iText-2.1.7.jar"
set CP=%CP%;"%DIRNAME%lib/poi-3.7-20101029.jar"
set CP=%CP%;"%DIRNAME%lib/barcode4j-light-2.1.jar"
set CP=%CP%;"%DIRNAME%lib/commons-codec-1.5.jar"
set CP=%CP%;"%DIRNAME%lib/velocity-1.6.2.jar"
set CP=%CP%;"%DIRNAME%lib/oro-2.0.8.jar"
set CP=%CP%;"%DIRNAME%lib/commons-collections-3.2.1.jar"
set CP=%CP%;"%DIRNAME%lib/commons-lang-2.4.jar"
set CP=%CP%;"%DIRNAME%lib/bsh-2.1b2.jar"
set CP=%CP%;"%DIRNAME%lib/RXTXcomm.jar"
set CP=%CP%;"%DIRNAME%lib/jpos113.jar"
set CP=%CP%;"%DIRNAME%lib/swingx-1.0.jar"
set CP=%CP%;"%DIRNAME%lib/substance.jar"
set CP=%CP%;"%DIRNAME%lib/substance-swingx.jar"
set CP=%CP%;"%DIRNAME%lib/rsyntaxtextarea-1.5.2.jar"

rem Apache Axis SOAP libraries.
set CP=%CP%;"%DIRNAME%lib/axis.jar"
set CP=%CP%;"%DIRNAME%lib/jaxrpc.jar"
set CP=%CP%;"%DIRNAME%lib/saaj.jar"
set CP=%CP%;"%DIRNAME%lib/wsdl4j.jar"
set CP=%CP%;"%DIRNAME%lib/commons-discovery-0.4.jar"
set CP=%CP%;"%DIRNAME%lib/commons-logging-1.1.1.jar"

set CP=%CP%;"%DIRNAME%locales/"
set CP=%CP%;"%DIRNAME%reports/"

set CP=%CP%;"%DIRNAME%lib/freefont-20100919"

start /B javaw -cp %CP% -Djava.util.logging.config.file="%DIRNAME%logging.properties" -Djava.library.path="%DIRNAME%lib/Windows/i368-mingw32" -Ddirname.path="%DIRNAME%./" com.openbravo.pos.forms.StartPOS %1
