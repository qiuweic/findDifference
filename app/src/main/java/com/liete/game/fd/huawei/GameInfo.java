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
        // 此坐标是基于700*525的图片大小计算出来的坐标
        GAME_LEVEL_COORDINATE.put(1, new int[][]{{12, 402, 105, 516}, {303, 20, 380, 100}, {345, 369, 450, 505}, {465, 143, 562, 262}, {642, 45, 701, 144}});
        GAME_LEVEL_COORDINATE.put(2, new int[][]{{23, 135, 105, 301}, {32, 286, 162, 484}, {361, 32, 479, 169}, {422, 283, 545, 434}, {592, 20, 687, 104}});
        GAME_LEVEL_COORDINATE.put(3, new int[][]{{57, 279, 200, 397}, {200, 287, 290, 452}, {339, 395, 435, 518}, {523, 110, 630, 209}, {565, 187, 667, 291}});
        GAME_LEVEL_COORDINATE.put(4, new int[][]{{53, 167, 214, 320}, {163, 13, 297, 136}, {267, 357, 342, 474}, {325, 314, 417, 450}, {342, 148, 447, 296}});
        GAME_LEVEL_COORDINATE.put(5, new int[][]{{121, 159, 221, 287}, {128, 283, 230, 415}, {362, 162, 450, 265}, {525, 199, 601, 319}, {558, 60, 696, 241}});
        GAME_LEVEL_COORDINATE.put(6, new int[][]{{81, 18, 218, 125}, {170, 132, 282, 222}, {62, 356, 180, 467}, {292, 31, 404, 150}, {496, 135, 607, 270}});
        GAME_LEVEL_COORDINATE.put(7, new int[][]{{72, 52, 158, 164}, {135, 195, 250, 303}, {256, 258, 372, 410}, {376, 41, 473, 176}, {452, 209, 578, 347}});
        GAME_LEVEL_COORDINATE.put(8, new int[][]{{51, 352, 257, 503}, {207, 88, 329, 298}, {424, 146, 531, 300}, {512, 149, 685, 291}, {597, 66, 691, 238}});
        GAME_LEVEL_COORDINATE.put(9, new int[][]{{363, 45, 461, 155}, {224, 57, 333, 196}, {207, 328, 304, 420}, {279, 425, 356, 509}, {393, 348, 525, 451}});
        GAME_LEVEL_COORDINATE.put(10, new int[][]{{200, 46, 293, 142}, {194, 302, 341, 456}, {348, 339, 438, 451}, {432, 217, 545, 334}, {613, 99, 670, 212}});
        GAME_LEVEL_COORDINATE.put(11, new int[][]{{18, 302, 109, 447}, {187, 96, 275, 179}, {385, 100, 465, 180}, {566, 321, 662, 419}, {592, 228, 689, 375}});
        GAME_LEVEL_COORDINATE.put(12, new int[][]{{53, 285, 135, 414}, {171, 381, 279, 493}, {315, 88, 408, 186}, {342, 207, 444, 322}, {407, 371, 500, 500}});
        GAME_LEVEL_COORDINATE.put(13, new int[][]{{75, 17, 235, 117}, {160, 109, 315, 264}, {293, 211, 379, 305}, {436, 114, 665, 331}, {295, 398, 395, 499}});
        GAME_LEVEL_COORDINATE.put(14, new int[][]{{100, 159, 202, 248}, {57, 345, 151, 450}, {305, 281, 386, 392}, {375, 429, 508, 512}, {520, 153, 603, 247}});
        GAME_LEVEL_COORDINATE.put(15, new int[][]{{135, 42, 257, 127}, {152, 228, 367, 306}, {376, 148, 467, 254}, {363, 253, 493, 366}, {319, 397, 429, 501}});
        GAME_LEVEL_COORDINATE.put(16, new int[][]{{133, 224, 219, 326}, {21, 357, 144, 498}, {484, 116, 601, 181}, {462, 167, 555, 230}, {485, 365, 557, 446}});
        GAME_LEVEL_COORDINATE.put(17, new int[][]{{27, 169, 111, 270}, {125, 326, 242, 416}, {248, 355, 334, 443}, {399, 262, 496, 360}, {614, 347, 697, 455}});
        GAME_LEVEL_COORDINATE.put(18, new int[][]{{269, 181, 360, 283}, {529, 31, 640, 132}, {435, 217, 534, 315}, {647, 303, 693, 411}, {294, 400, 400, 497}});
        GAME_LEVEL_COORDINATE.put(19, new int[][]{{264, 22, 387, 120}, {448, 175, 597, 268}, {76, 373, 181, 465}, {158, 321, 249, 424}, {464, 318, 562, 383}});
        GAME_LEVEL_COORDINATE.put(20, new int[][]{{53, 238, 153, 356}, {213, 21, 294, 84}, {242, 377, 342, 478}, {333, 291, 433, 414}, {509, 432, 612, 523}});
        GAME_LEVEL_COORDINATE.put(21, new int[][]{{353, 12, 461, 72}, {423, 169, 563, 267}, {344, 248, 453, 383}, {565, 279, 674, 389}, {404, 451, 631, 508}});
        GAME_LEVEL_COORDINATE.put(22, new int[][]{{13, 303, 77, 403}, {45, 168, 144, 315}, {263, 23, 396, 129}, {439, 147, 533, 262}, {310, 363, 401, 450}});
        GAME_LEVEL_COORDINATE.put(23, new int[][]{{146, 54, 329, 191}, {251, 191, 372, 277}, {332, 275, 473, 403}, {205, 404, 343, 479}, {531, 289, 636, 457}});
        GAME_LEVEL_COORDINATE.put(24, new int[][]{{98, 94, 234, 206}, {36, 175, 146, 272}, {301, 30, 401, 131}, {317, 295, 406, 387}, {472, 243, 545, 335}});
        GAME_LEVEL_COORDINATE.put(25, new int[][]{{111, 248, 190, 353}, {269, 41, 350, 132}, {363, 253, 465, 350}, {347, 337, 456, 438}, {584, 20, 697, 115}});
        GAME_LEVEL_COORDINATE.put(26, new int[][]{{15, 87, 73, 218}, {260, 236, 346, 341}, {325, 202, 411, 302}, {601, 114, 696, 219}, {551, 14, 670, 104}});
        GAME_LEVEL_COORDINATE.put(27, new int[][]{{53, 363, 152, 478}, {367, 457, 465, 523}, {508, 441, 604, 518}, {619, 412, 697, 492}, {543, 11, 655, 101}});
        GAME_LEVEL_COORDINATE.put(28, new int[][]{{17, 28, 111, 151}, {166, 0, 247, 59}, {158, 38, 305, 125}, {228, 255, 332, 340}, {48, 364, 187, 503}});
        GAME_LEVEL_COORDINATE.put(29, new int[][]{{8, 175, 90, 268}, {58, 262, 146, 362}, {239, 448, 310, 525}, {461, 3, 555, 82}, {397, 235, 522, 396}});
        GAME_LEVEL_COORDINATE.put(30, new int[][]{{7, 238, 103, 337}, {115, 99, 207, 201}, {317, 170, 391, 281}, {494, 258, 638, 359}, {636, 9, 699, 109}});
        GAME_LEVEL_COORDINATE.put(31, new int[][]{{615, 10, 675, 60}, {160, 135, 210, 195}, {215, 220, 265, 260}, {65, 465, 120, 520}, {505, 465, 575, 520}});
        GAME_LEVEL_COORDINATE.put(32, new int[][]{{110, 25, 170, 80}, {615, 170, 665, 265}, {48, 275, 120, 320}, {135, 420, 180, 470}, {430, 405, 550, 445}});
        GAME_LEVEL_COORDINATE.put(33, new int[][]{{350, 180, 420, 240}, {220, 190, 300, 240}, {175, 380, 225, 455}, {460, 390, 520, 450}, {595, 425, 655, 495}});
        GAME_LEVEL_COORDINATE.put(34, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(35, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(36, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(37, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(38, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(39, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(40, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(41, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(42, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(43, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(44, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(45, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(46, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(47, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(48, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(49, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(50, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(51, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(52, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(53, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(54, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(55, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(56, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(57, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(58, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(59, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(60, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(61, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(62, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(63, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(64, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(65, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(66, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(67, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(68, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(69, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(70, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(71, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(72, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(73, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(74, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(75, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(76, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(77, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(78, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(79, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(80, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(81, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(82, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(83, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(84, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(85, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(86, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(87, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(88, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(89, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(90, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}});
        GAME_LEVEL_COORDINATE.put(91, new int[][]{{65, 250, 120, 365}, {160, 100, 205, 155}, {320, 225, 385, 275}, {260, 370, 320, 440}, {620, 345, 670, 425}});
        GAME_LEVEL_COORDINATE.put(92, new int[][]{{170, 150, 225, 225}, {445, 15, 500, 80}, {300, 370, 445, 420}, {645, 380, 700, 455}, {305, 475, 385, 525}});
        GAME_LEVEL_COORDINATE.put(93, new int[][]{{100, 70, 170, 130}, {8, 270, 50, 315}, {345, 145, 385, 185}, {380, 260, 435, 325}, {635, 160, 680, 200}});
        GAME_LEVEL_COORDINATE.put(94, new int[][]{{30, 335, 90, 390}, {215, 70, 315, 235}, {185, 290, 340, 335}, {475, 320, 520, 410}, {540, 200, 600, 250}});
        GAME_LEVEL_COORDINATE.put(95, new int[][]{{55, 15, 145, 150}, {380, 15, 525, 100}, {335, 215, 375, 285}, {460, 205, 540, 270}, {235, 280, 285, 465}});
        GAME_LEVEL_COORDINATE.put(96, new int[][]{{1, 80, 65, 312}, {170, 120, 220, 195}, {345, 65, 385, 140}, {400, 215, 465, 300}, {610, 285, 700, 340}});
        GAME_LEVEL_COORDINATE.put(97, new int[][]{{3, 245, 50, 320}, {85, 160, 135, 240}, {225, 10, 275, 75}, {390, 250, 500, 320}, {670, 175, 700, 280}});
        GAME_LEVEL_COORDINATE.put(98, new int[][]{{40, 4, 110, 90}, {210, 140, 270, 265}, {608, 130, 655, 250}, {175, 405, 240, 455}, {600, 365, 644, 465}});
        GAME_LEVEL_COORDINATE.put(99, new int[][]{{90, 130, 168, 247}, {195, 165, 245, 230}, {585, 90, 630, 165}, {17, 370, 175, 420}, {175, 478, 405, 525}});
        GAME_LEVEL_COORDINATE.put(100, new int[][]{{5, 5, 70, 90}, {285, 5, 360, 85}, {475, 180, 520, 260}, {115, 345, 228, 400}, {355, 324, 415, 385}});
    }
}
