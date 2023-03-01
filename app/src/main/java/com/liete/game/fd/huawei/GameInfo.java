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
        GAME_LEVEL_INFO.put(3, new int[]{R.drawable.level_3, R.drawable.level_3_diff});
        GAME_LEVEL_INFO.put(4, new int[]{R.drawable.level_4, R.drawable.level_4_diff});
        GAME_LEVEL_INFO.put(5, new int[]{R.drawable.level_5, R.drawable.level_5_diff});
        GAME_LEVEL_INFO.put(6, new int[]{R.drawable.level_6, R.drawable.level_6_diff});
        GAME_LEVEL_INFO.put(7, new int[]{R.drawable.level_7, R.drawable.level_7_diff});
        GAME_LEVEL_INFO.put(8, new int[]{R.drawable.level_8, R.drawable.level_8_diff});
        GAME_LEVEL_INFO.put(9, new int[]{R.drawable.level_9, R.drawable.level_9_diff});
        GAME_LEVEL_INFO.put(10, new int[]{R.drawable.level_10, R.drawable.level_10_diff});
        GAME_LEVEL_INFO.put(11, new int[]{R.drawable.level_11, R.drawable.level_11_diff});
        GAME_LEVEL_INFO.put(12, new int[]{R.drawable.level_12, R.drawable.level_12_diff});
        GAME_LEVEL_INFO.put(13, new int[]{R.drawable.level_13, R.drawable.level_13_diff});
        GAME_LEVEL_INFO.put(14, new int[]{R.drawable.level_14, R.drawable.level_14_diff});
        GAME_LEVEL_INFO.put(15, new int[]{R.drawable.level_15, R.drawable.level_15_diff});
        GAME_LEVEL_INFO.put(16, new int[]{R.drawable.level_16, R.drawable.level_16_diff});
        GAME_LEVEL_INFO.put(17, new int[]{R.drawable.level_17, R.drawable.level_17_diff});
        GAME_LEVEL_INFO.put(18, new int[]{R.drawable.level_18, R.drawable.level_18_diff});
        GAME_LEVEL_INFO.put(19, new int[]{R.drawable.level_19, R.drawable.level_19_diff});
        GAME_LEVEL_INFO.put(20, new int[]{R.drawable.level_20, R.drawable.level_20_diff});
        GAME_LEVEL_INFO.put(21, new int[]{R.drawable.level_21, R.drawable.level_21_diff});
        GAME_LEVEL_INFO.put(22, new int[]{R.drawable.level_22, R.drawable.level_22_diff});
        GAME_LEVEL_INFO.put(23, new int[]{R.drawable.level_23, R.drawable.level_23_diff});
        GAME_LEVEL_INFO.put(24, new int[]{R.drawable.level_24, R.drawable.level_24_diff});
        GAME_LEVEL_INFO.put(25, new int[]{R.drawable.level_25, R.drawable.level_25_diff});
        GAME_LEVEL_INFO.put(26, new int[]{R.drawable.level_26, R.drawable.level_26_diff});
        GAME_LEVEL_INFO.put(27, new int[]{R.drawable.level_27, R.drawable.level_27_diff});
        GAME_LEVEL_INFO.put(28, new int[]{R.drawable.level_28, R.drawable.level_28_diff});
        GAME_LEVEL_INFO.put(29, new int[]{R.drawable.level_29, R.drawable.level_29_diff});
        GAME_LEVEL_INFO.put(30, new int[]{R.drawable.level_30, R.drawable.level_30_diff});
        GAME_LEVEL_INFO.put(31, new int[]{R.drawable.level_31, R.drawable.level_31_diff});
        GAME_LEVEL_INFO.put(32, new int[]{R.drawable.level_32, R.drawable.level_32_diff});
        GAME_LEVEL_INFO.put(33, new int[]{R.drawable.level_33, R.drawable.level_33_diff});
        GAME_LEVEL_INFO.put(34, new int[]{R.drawable.level_34, R.drawable.level_34_diff});
        GAME_LEVEL_INFO.put(35, new int[]{R.drawable.level_35, R.drawable.level_35_diff});
        GAME_LEVEL_INFO.put(36, new int[]{R.drawable.level_36, R.drawable.level_36_diff});
        GAME_LEVEL_INFO.put(37, new int[]{R.drawable.level_37, R.drawable.level_37_diff});
        GAME_LEVEL_INFO.put(38, new int[]{R.drawable.level_38, R.drawable.level_38_diff});
        GAME_LEVEL_INFO.put(39, new int[]{R.drawable.level_39, R.drawable.level_39_diff});
        GAME_LEVEL_INFO.put(40, new int[]{R.drawable.level_40, R.drawable.level_40_diff});
        GAME_LEVEL_INFO.put(41, new int[]{R.drawable.level_41, R.drawable.level_41_diff});
        GAME_LEVEL_INFO.put(42, new int[]{R.drawable.level_42, R.drawable.level_42_diff});
        GAME_LEVEL_INFO.put(43, new int[]{R.drawable.level_43, R.drawable.level_43_diff});
        GAME_LEVEL_INFO.put(44, new int[]{R.drawable.level_44, R.drawable.level_44_diff});
        GAME_LEVEL_INFO.put(45, new int[]{R.drawable.level_45, R.drawable.level_45_diff});
        GAME_LEVEL_INFO.put(46, new int[]{R.drawable.level_46, R.drawable.level_46_diff});
        GAME_LEVEL_INFO.put(47, new int[]{R.drawable.level_47, R.drawable.level_47_diff});
        GAME_LEVEL_INFO.put(48, new int[]{R.drawable.level_48, R.drawable.level_48_diff});
        GAME_LEVEL_INFO.put(49, new int[]{R.drawable.level_49, R.drawable.level_49_diff});
        GAME_LEVEL_INFO.put(50, new int[]{R.drawable.level_50, R.drawable.level_50_diff});
        GAME_LEVEL_INFO.put(51, new int[]{R.drawable.level_51, R.drawable.level_51_diff});
        GAME_LEVEL_INFO.put(52, new int[]{R.drawable.level_52, R.drawable.level_52_diff});
        GAME_LEVEL_INFO.put(53, new int[]{R.drawable.level_53, R.drawable.level_53_diff});
        GAME_LEVEL_INFO.put(54, new int[]{R.drawable.level_54, R.drawable.level_54_diff});
        GAME_LEVEL_INFO.put(55, new int[]{R.drawable.level_55, R.drawable.level_55_diff});
        GAME_LEVEL_INFO.put(56, new int[]{R.drawable.level_56, R.drawable.level_56_diff});
        GAME_LEVEL_INFO.put(57, new int[]{R.drawable.level_57, R.drawable.level_57_diff});
        GAME_LEVEL_INFO.put(58, new int[]{R.drawable.level_58, R.drawable.level_58_diff});
        GAME_LEVEL_INFO.put(59, new int[]{R.drawable.level_59, R.drawable.level_59_diff});
        GAME_LEVEL_INFO.put(60, new int[]{R.drawable.level_60, R.drawable.level_60_diff});
        GAME_LEVEL_INFO.put(61, new int[]{R.drawable.level_61, R.drawable.level_61_diff});
        GAME_LEVEL_INFO.put(62, new int[]{R.drawable.level_62, R.drawable.level_62_diff});
        GAME_LEVEL_INFO.put(63, new int[]{R.drawable.level_63, R.drawable.level_63_diff});
        GAME_LEVEL_INFO.put(64, new int[]{R.drawable.level_64, R.drawable.level_64_diff});
        GAME_LEVEL_INFO.put(65, new int[]{R.drawable.level_65, R.drawable.level_65_diff});
        GAME_LEVEL_INFO.put(66, new int[]{R.drawable.level_66, R.drawable.level_66_diff});
        GAME_LEVEL_INFO.put(67, new int[]{R.drawable.level_67, R.drawable.level_67_diff});
        GAME_LEVEL_INFO.put(68, new int[]{R.drawable.level_68, R.drawable.level_68_diff});
        GAME_LEVEL_INFO.put(69, new int[]{R.drawable.level_69, R.drawable.level_69_diff});
        GAME_LEVEL_INFO.put(70, new int[]{R.drawable.level_70, R.drawable.level_70_diff});
        GAME_LEVEL_INFO.put(71, new int[]{R.drawable.level_71, R.drawable.level_71_diff});
        GAME_LEVEL_INFO.put(72, new int[]{R.drawable.level_72, R.drawable.level_72_diff});
        GAME_LEVEL_INFO.put(73, new int[]{R.drawable.level_73, R.drawable.level_73_diff});
        GAME_LEVEL_INFO.put(74, new int[]{R.drawable.level_74, R.drawable.level_74_diff});
        GAME_LEVEL_INFO.put(75, new int[]{R.drawable.level_75, R.drawable.level_75_diff});
        GAME_LEVEL_INFO.put(76, new int[]{R.drawable.level_76, R.drawable.level_76_diff});
        GAME_LEVEL_INFO.put(77, new int[]{R.drawable.level_77, R.drawable.level_77_diff});
        GAME_LEVEL_INFO.put(78, new int[]{R.drawable.level_78, R.drawable.level_78_diff});
        GAME_LEVEL_INFO.put(79, new int[]{R.drawable.level_79, R.drawable.level_79_diff});
        GAME_LEVEL_INFO.put(80, new int[]{R.drawable.level_80, R.drawable.level_80_diff});
        GAME_LEVEL_INFO.put(81, new int[]{R.drawable.level_81, R.drawable.level_81_diff});
        GAME_LEVEL_INFO.put(82, new int[]{R.drawable.level_82, R.drawable.level_82_diff});
        GAME_LEVEL_INFO.put(83, new int[]{R.drawable.level_83, R.drawable.level_83_diff});
        GAME_LEVEL_INFO.put(84, new int[]{R.drawable.level_84, R.drawable.level_84_diff});
        GAME_LEVEL_INFO.put(85, new int[]{R.drawable.level_85, R.drawable.level_85_diff});
        GAME_LEVEL_INFO.put(86, new int[]{R.drawable.level_86, R.drawable.level_86_diff});
        GAME_LEVEL_INFO.put(87, new int[]{R.drawable.level_87, R.drawable.level_87_diff});
        GAME_LEVEL_INFO.put(88, new int[]{R.drawable.level_88, R.drawable.level_88_diff});
        GAME_LEVEL_INFO.put(89, new int[]{R.drawable.level_89, R.drawable.level_89_diff});
        GAME_LEVEL_INFO.put(90, new int[]{R.drawable.level_90, R.drawable.level_90_diff});
        GAME_LEVEL_INFO.put(91, new int[]{R.drawable.level_91, R.drawable.level_91_diff});
        GAME_LEVEL_INFO.put(92, new int[]{R.drawable.level_92, R.drawable.level_92_diff});
        GAME_LEVEL_INFO.put(93, new int[]{R.drawable.level_93, R.drawable.level_93_diff});
        GAME_LEVEL_INFO.put(94, new int[]{R.drawable.level_94, R.drawable.level_94_diff});
        GAME_LEVEL_INFO.put(95, new int[]{R.drawable.level_95, R.drawable.level_95_diff});
        GAME_LEVEL_INFO.put(96, new int[]{R.drawable.level_96, R.drawable.level_96_diff});
        GAME_LEVEL_INFO.put(97, new int[]{R.drawable.level_97, R.drawable.level_97_diff});
        GAME_LEVEL_INFO.put(98, new int[]{R.drawable.level_98, R.drawable.level_98_diff});
        GAME_LEVEL_INFO.put(99, new int[]{R.drawable.level_99, R.drawable.level_99_diff});
        GAME_LEVEL_INFO.put(100, new int[]{R.drawable.level_100, R.drawable.level_100_diff});
    }

    static { // Left,Top, Right, Bottom
        // 此坐标是基于1080*2360的手机分辨率计算出来的，在不同手机的分辨率上，坐标值不一样
        GAME_LEVEL_COORDINATE.put(1, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(2, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(3, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(4, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(5, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(6, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(7, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(8, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(9, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(10, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(11, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(12, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(13, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(14, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(15, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(16, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(17, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(18, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(19, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(20, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(21, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(22, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(23, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(24, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(25, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(26, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(27, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(28, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(29, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(30, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(31, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(32, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(33, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(34, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(35, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(36, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(37, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(38, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(39, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(40, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(41, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(42, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(43, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(44, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(45, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(46, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(47, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(48, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(49, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(50, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(51, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(52, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(53, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(54, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(55, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(56, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(57, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(58, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(59, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(60, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(61, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(62, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(63, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(64, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(65, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(66, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(67, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(68, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(69, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(70, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(71, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(72, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(73, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(74, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(75, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(76, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(77, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(78, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(79, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(80, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(81, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(82, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(83, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(84, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(85, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(86, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(87, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(88, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(89, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(90, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(91, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(92, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(93, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(94, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(95, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(96, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(97, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
        GAME_LEVEL_COORDINATE.put(98, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(99, new int[][]{{130, 110, 260, 250}, {500, 480, 620, 660}, {50, 460, 180, 640}, {630, 810, 750, 1000}, {540, 1040, 640, 1170}});
        GAME_LEVEL_COORDINATE.put(100, new int[][]{{660, 240, 800, 400}, {670, 530, 790, 660}, {900, 660, 1050, 820}, {680, 810, 820, 940}, {750, 1000, 890, 1130}});
    }
}
