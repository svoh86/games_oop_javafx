package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPositionMatches() {
        Figure figure = new BishopBlack(Cell.F8);
        Cell cell = figure.position();
        int expectedX = 5;
        int expectedY = 0;
        assertEquals(expectedX, cell.getX());
        assertEquals(expectedY, cell.getY());
    }

    @Test
    public void whenCopyIsValidPosition() {
        Figure figure = new BishopBlack(Cell.F8);
        Cell cell = figure.position();
        assertEquals(figure, figure.copy(cell));
    }

    @Test
    public void whenWayCOneToGFive() {
        Figure figure = new BishopBlack(Cell.C1);
        Cell[] rsl = figure.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expected, rsl);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayImpossible() {
        Figure figure = new BishopBlack(Cell.C1);
        Cell[] rsl = figure.way(Cell.D3);
    }
}