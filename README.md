# Игра “20 спичек”

Правила игры

В начале игры на столе лежит 20 спичек.
Игроки ходят по очереди, убирая на выбор 1, 2 или 3 спички.
Проигравшим считается тот, кто возьмет со стола последнюю спичку.

Требования к программе

Программа должна позволять вам играть с компьютером.
Компьютер должен делать ход первым и всегда вас выигрывать (существует алгоритм выигрыша для игрока, делающего первый ход).

Кейсы, которые необходимо учесть:

    Программа должна объявлять в консоли следующие события:
        Момент начала игры.
        Оставшееся количество спичек после каждого хода.
        Кто выполняет текущий ход.
        Момент окончания игры и победителя.
    При вводе в консоль недопустимого числа спичек для взятия со стола, должна выводиться ошибка и предложение повторного ввода.


Рекомендации к проектированию программы

    В ходе программы рекомендуется использовать стандартный поток вывода (консоль).
    Считывать число можно методом nextInt() класса Scanner, передавая на вход поток System.in.
    Учтите, что вам нужно хранить оставшееся количество спичек и игрока, который сейчас делает ход.
    Правильно разбейте программу на классы и методы:
        Добавьте основной класс для логики контроля хода игры.
        Добавьте класс для вывода сообщений в консоль.
        Добавьте класс для логики компьютера.
