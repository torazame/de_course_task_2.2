# de_course_task_2.2

Домашнее задание Scala

1.     1. Подготовьте все необходимое для работы с языком Scala:

a. Установите Java 8 JDK(https://www.oracle.com/java/technologies/downloads/#java8). В принципе этот шаг можно пропустить, т.к. IDEA сама предложит вам установить JDK, если вы вдруг забудете. Но, упражнение по самостоятельной установке JDK тоже полезное.

  b. Установите Intellij IDEA (https://www.jetbrains.com/idea/download/#section=windows)

  c. Установите плагин для Scala (https://www.jetbrains.com/help/idea/discover-intellij-idea-for-scala.html#UserInterface)

  d. Если планируете использовать sbt для сборки вашего проекта – он уже предустановлен: https://docs.scala-lang.org/getting-started/intellij-track/getting-started-with-scala-in-intellij.html

  e. Если планируете использовать maven – подробное руководство по установке и сборке проекта с помощью maven: https://www.javahelps.com/2021/03/create-scala-with-maven-project-in.html


1.     2.     Создайте ваш первый проект, который печатает на экран фразу «Hello, Scala!». Запустите ваш код, убедитесь, что он работает и попробуйте собрать ваш первый jar’ник.

2.     3. Далее нам предстоит потренировать наши навыки работы с языком Scala, чтобы вы смогли привыкнуть к синтаксису языка, его особенностям и познакомились с основными конструкциями. Поэтому предлагаю порешать следующие задачки:

a.    Напишите программу, которая:

                                                    i.     выводит фразу «Hello, Scala!» справа налево

                                                   ii.     переводит всю фразу в нижний регистр

                                                  iii.     удаляет символ!

                                                 iv.     добавляет в конец фразы «and goodbye python!»

b.     Напишите программу, которая вычисляет ежемесячный оклад сотрудника после вычета налогов. На вход вашей программе подается значение годового дохода до вычета налогов, размер премии – в процентах от годового дохода и компенсация питания.

с.     Напишите программу, которая рассчитывает для каждого сотрудника отклонение(в процентах) от среднего значения оклада на уровень всего отдела. В итоговом значении должно учитываться в большую или меньшую сторону отклоняется размер оклада. На вход вышей программе подаются все значения, аналогичные предыдущей программе, а также список со значениями окладов сотрудников отдела 100, 150, 200, 80, 120, 75.

d.      Попробуйте рассчитать новую зарплату сотрудника, добавив(или отняв, если сотрудник плохо себя вел) необходимую сумму с учетом результатов прошлого задания. Добавьте его зарплату в список и вычислите значение самой высокой зарплаты и самой низкой.

e.     Также в вашу команду пришли два специалиста с окладами 350 и 90 тысяч рублей. Попробуйте отсортировать список сотрудников по уровню оклада от меньшего к большему.

f.     Кажется, вы взяли в вашу команду еще одного сотрудника и предложили ему оклад 130 тысяч. Вычислите самостоятельно номер сотрудника в списке так, чтобы сортировка не нарушилась и добавьте его на это место.

g.       Попробуйте вывести номера сотрудников из полученного списка, которые попадают под категорию middle. На входе программе подается «вилка» зарплаты специалистов уровня middle.

h.     Однако наступил кризис и ваши сотрудники требуют повысить зарплату. Вам необходимо проиндексировать зарплату каждого сотрудника на уровень инфляции – 7%

i.    *Ваши сотрудники остались недовольны и просят индексацию на уровень рынка. Попробуйте повторить ту же операцию, как и в предыдущем задании, но теперь вам нужно проиндексировать зарплаты на процент отклонения от среднего по рынку с учетом уровня специалиста. На вход вашей программе подается 3 значения – среднее значение зарплаты на рынке для каждого уровня специалистов(junior, middle и senior)

j. ****(для тех, кто любит хардкор) Попробуйте самостоятельно вычислить средние значения уровня зарплат для data engineer’ов каждого уровня с помощью, например,  https://dev.hh.ru/.

k.      *Попробуйте деанонимизировать ваших сотрудников – составьте структуру, которая позволит иметь знания о том, сколько зарабатывает каждый сотрудник(Фамилия и имя).

l.     *Выведите фамилию и имя сотрудников с самой высокой и самой низкой зарплатой(только не рассказывайте им об этом факте).

m.      *Попробуйте запутать тех, кто может случайно наткнуться на эти данные – удалите для каждого сотрудника имя, переведите строку в нижний регистр, удалите гласные и разверните оставшиеся символы справа налево(abc -> cb).

n.     *Опробуйте завернуть программу из пункта 3.b в функцию и входные значения переделать в параметры функции.

o.      *Попробуйте написать функцию, которая вычисляет значение степени двойки:

                                                    i.     С помощью обычной рекурсии

                                                   ii.     **С помощью хвостовой рекурсии 