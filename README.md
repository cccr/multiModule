# multiModule
## pre-push git-hook demo

A tiny maven multi-module project is presented to demonstrate a pre-push git-hook. Only tests inside changed or dependent to changed modules will run.
If you change the content of any file in module **a**, then tests execution in module **b** will be triggered, as it depends on **a**.
However, changes in module **c** will not trigger the launch of tests in other modules, since this module does not depend on anyone.

Представлен проект, для демонстрации pre-push git-хука, который запускает тесты на измененных и зависящих от измененных модулях.
Если мы изменим содержимое любого файла в модуле **a**, то запустятся тесты в моудле **b**, так он он зависит от **a**.
Изменения в модуле **c** не спровоцируют запуск тестов в других модулях, так как этот модуль ни от кого не зависит.
