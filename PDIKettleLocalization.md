# Вступление #

[Pentaho Data Integration](http://kettle.pentaho.org/) является мощным инструментом для работы с информацией, её отличительной особенностью является мощный инструмент визуального построения алгоритмов обработки данных. Круг работающих с данной системой не очень велик, но её потенциал очень высок, к томуже стабильность работы системы повышается от релиза к релизу.

# Описание #

Pentaho Data Integration (PDI, также называемая Kettle) - компонент комплекса Pentaho отвечающий за процесс Извлечения, Преобразования и Загрузки (Extract, Transform and Load - ETL). Данная система чаще всего используется при работе с хранилищами данных, но так же её возможности позволяют осуществлять:
  * обмен данными между приложениями или базами данных;
  * экспорт информации из баз данных в файлы различных типов;
  * загрузка массивов данных в базы данных;
  * обработка данных;
  * интеграция с другими приложениями.

На сегодня стабильной версией системы, является [Pentaho Data Integration CE 3.2.0 stable](http://sourceforge.net/project/showfiles.php?group_id=140317&package_id=186321&release_id=682677).

# Предложение #

Основной особенностью PDI:Kettle является простота её использования. Человек даже слабо  знакомый с программированием, но знающий основы построения алгоритмов, может начать строить свои схемы для обработки данных. Однако для русскоязычного пользователя, есть очень важно препятствие в этой работе, это отсутствие устоявшейся терминологии в области [ETL](http://ru.wikipedia.org/wiki/ETL) комплексов. Предлагаю обсудить возможности и перспективы работы в направлении локализации терминов и понятий применяемых в частности в системе PDI:Kettle.

# Задачи #

В задачи по локализации могут войти следующие направления:

## Перевод PDI:Kettle ##

Эта задача будет включать в себя перевод интерфейса PDI:Kettle. Для текущей стабильной версии 3.2.0 это примерно 6300 уникальных строк в 137 пакетах программы.

В качестве инструментов для перевода могут выступать:
  * Специально разработанная для этих целей [программа Pentaho Translator 2](http://wiki.pentaho.com/display/EAI/i18n+made+easy+with+the+%28new%29+Pentaho+Translator), распространяемая вместе с исходным кодом PDI:Kettle система автоматизации перевода.

## Составление словаря ##

Составление словаря используемых терминов.

## Документация на русском языке ##

Перевод и адаптация документации.

# Ссылки #

## Подробная информация по системе ##
  * [Инструкции по инсталляции PDI:Kettle, руководство для пользователей и прочее.](http://wiki.pentaho.com/display/EAI/Latest+Pentaho+Data+Integration+(aka+Kettle)+Documentation)
  * [Сообщить об ошибках в PDI:Kettle и предложить свои идеи.](http://jira.pentaho.com/browse/PDI)
  * [Форум для получения помощи и участия в обсуждении PDI:Kettle.](http://forums.pentaho.org/forumdisplay.php?f=69)

## Проекты связанные с использованием Pentaho Data Integration ##
  * [Синхронизация между Openravo POS 2.30 и Openbravo ERP 2.50.](http://wiki.openbravo.com/wiki/Openbravo_POS_Integration#Openbravo_POS_configuration)
  * [Схемы на русском языке для  Openravo POS 2.20.](http://code.google.com/p/openbravoposru/)