import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviesManagerTest {

    @Test
    public void addTest() {
    MoviesManager manager = new MoviesManager();
        manager.add("F1");
        manager.add("F2");
        manager.add("F3");
        manager.add("F4");
        manager.add("F5");
        manager.add("F6");
        manager.add("F7");
        manager.add("F8");
        manager.add("F9");
        manager.add("F10");

        String[] actual = manager.findAll();
        String[] expected = {
                "F1",
                "F2",
                "F3",
                "F4",
                "F5",
                "F6",
                "F7",
                "F8",
                "F9",
                "F10",
        };
        assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastTest() {
        MoviesManager manager = new MoviesManager();
        manager.add("F1");
        manager.add("F2");
        manager.add("F3");
        manager.add("F4");
        manager.add("F5");
        manager.add("F6");
        manager.add("F7");
        manager.add("F8");
        manager.add("F9");
        manager.add("F10");
        manager.add("F11");
        manager.add("F12");

        String[] actual = manager.findLast();
        String[] expected = {
                "F12",
                "F11",
                "F10",
                "F9",
                "F8",
                "F7",
                "F6",
                "F5",
                "F4",
                "F3",

        };
        assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastTestWithConstructorValue() {
        MoviesManager manager = new MoviesManager(5);
        manager.add("F1");
        manager.add("F2");
        manager.add("F3");
        manager.add("F4");
        manager.add("F5");
        manager.add("F6");
        manager.add("F7");
        manager.add("F8");
        manager.add("F9");
        manager.add("F10");

        String[] actual = manager.findLast();
        String[] expected = {
                "F10",
                "F9",
                "F8",
                "F7",
                "F6"

        };
        assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastTestWithLessFilmsThanLimit() {
        MoviesManager manager = new MoviesManager(5);
        manager.add("F1");
        manager.add("F2");
        manager.add("F3");

        String[] actual = manager.findLast();
        String[] expected = {

                "F3",
                "F2",
                "F1"

        };
        assertArrayEquals(actual, expected);
    }

}

