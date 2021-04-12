package scofe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostTest3BrandyTest {

    @Test
    public void testGetMaxClothes() {
        PostTest3Brandy brandy = new PostTest3Brandy();
        int[][] map = new int[2][2];
        int[][] dp = new int[2][2];
        map[0][0] = 1;
        map[0][1] = 1;
        map[1][0] = 3;
        map[1][1] = 3;

        int answer = brandy.getMaxClothes(map, dp, 1, 1);
        assertEquals(7, answer);
    }

}