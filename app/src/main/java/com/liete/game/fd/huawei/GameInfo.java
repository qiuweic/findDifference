package com.liete.game.fd.huawei;

import android.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class GameInfo {

    // key:LevelId, value:ResourceIds
    public static Map<Integer, int[]>  GAME_LEVEL_INFO = new HashMap<>();

    // key:LevelId, value:Coordinates
    public static Map<Integer, int[][]> GAME_LEVEL_COORDINATE = new HashMap<>();

    public static Pair<Integer, Integer> getGameLevelInfo(int levelId) {
        int[] info = GAME_LEVEL_INFO.get(levelId);
        if (info != null) {
            return new Pair<>(info[0], info[1]);
        } else { // Error
            return new Pair<>(R.drawable.level_1, R.drawable.level_1_diff);
        }
    }

    public static int[][] getGameCoordinate(int levelId) {
        return GAME_LEVEL_COORDINATE.get(levelId);
    }

    static {
        GAME_LEVEL_INFO.put(1, new int[]{R.drawable.level_1, R.drawable.level_1_diff});
        GAME_LEVEL_INFO.put(2, new int[]{R.drawable.level_2, R.drawable.level_2_diff});
    }

    static { // Left,Top, Right, Bottom
        // 此坐标是基于1080*2360的手机分辨率计算出来的，在不同手机的分辨率上，坐标值不一样
        GAME_LEVEL_COORDINATE.put(1, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(2, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
    }
}
