# Кристијан Стојчев 163128

# Control Flow Graph
![163128](https://user-images.githubusercontent.com/88746360/171890978-f10cad54-37f3-4539-8397-2e6554dd04f3.png)


# Цикломатска комплексност
Cyclomatic complexity = E-N+2 
Број на ребра 32 број на јазли 25 
32 - 25 +2 = 9
Цикломатската комплексност е 9.

# Тест случаи според критериумот Every statement

 @Test
    void EveryStatementtest()
    {
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(Collections.emptyList()));
        IllegalArgumentException iex ;
        iex =assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("0", "#", "0", "0", "#")));
        assertTrue(iex.getMessage().contains("List length should be a perfect square"));
        assertEquals(Arrays.asList("#", "3", "#", "3", "#", "2", "#", "2", "0"), SILab2.function(Arrays.asList("#", "0", "#", "0", "#", "0", "#", "0", "0")));
    }

# Тест случаи според критериумот Every branch

@Test
    void EveryBranchStatement()
    {
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(Collections.emptyList()));
        IllegalArgumentException iex ;
        iex =assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("0", "#", "0", "0", "#")));
        assertTrue(iex.getMessage().contains("List length should be a perfect square"));
        assertEquals(Arrays.asList("#", "3", "#", "3", "#", "2", "#", "2", "0"), SILab2.function(Arrays.asList("#", "0", "#", "0", "#", "0", "#", "0", "0")));
    }

# Објаснување на напишаните unit tests
За Every statement тестовите со првиот assert ги изминувам јазлите A, B, C, W за условот дали должината на листата е поголема од 0 каде програмата фрла исклучок и го исполнува очекуваниот резултат на тестот. 
Потоа со вториот assert ги изминувам јазлите A, B, D, E, F, G, W со помош на тестирање преку порака проверувам дали програмата ќе фрли исклучок доколку должината на  внесената листа  нема правилен квадрат и тестот го исполнува условот.
Со третиот assert ги изминувам сите останати јазли од дијаграмот односно секој израз од програмата при што тестот успешно поминува (A, B, D, E, F, H, I.1, I.2, I.2, J, K, L, M, N, O, P, Q, R, S, T, U, V, W)

За Every branch тестовите исто како кај every statement во првиот дел од тестот како аргумент се праќа празна листа и се изминуваат патеките (А-В, B-C, C-W) програмата завршува со исклучок.
Кај вториот assert од овој тест се пратив 5 елементи во листата при што не се исполни условот должината на листата да има perfect square при што се завршува со исклучок и се изминуваат патеките (A-B, B-D, D-E, E-F, F-G, G-W)
Со третиот assert се изминуваат сите останати branches од програмата и како што е наведено во тестот враќа листа од стрингови правилно како што е наведено во програмата со што и овој тест помина целосно точно.


