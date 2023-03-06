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
        GAME_LEVEL_COORDINATE.put(3, new int[][]{{200, 1200, 600, 1600}, {720, 1350, 1160, 1760}, {1930, 550, 2274, 900}, {1307, 4052, 1595, 4418}, {2116, 3141, 2289, 3415}});
        GAME_LEVEL_COORDINATE.put(4, new int[][]{{232, 841, 711, 1202}, {631, 78, 1062, 296}, {1274, 769, 1603, 1082}, {921, 1614, 1236, 1910}, {1219, 1532, 1429, 1825}});
        GAME_LEVEL_COORDINATE.put(5, new int[][]{{543, 905, 710, 1121}, {519, 1274, 674, 1620}, {1409, 690, 1563, 957}, {1858, 926, 2148, 1145}, {2030, 338, 2414, 854}});
        GAME_LEVEL_COORDINATE.put(6, new int[][]{{293, 1527, 615, 1828}, {434, 105, 695, 427}, {654, 557, 923, 823}, {1122, 225, 1433, 543}, {1801, 789, 2092, 1066}});
        GAME_LEVEL_COORDINATE.put(7, new int[][]{{315, 342, 533, 574}, {572, 855, 836, 1184}, {996, 1403, 1239, 1642}, {1387, 280, 1663, 650}, {1712, 1026, 2027, 1372}});
        GAME_LEVEL_COORDINATE.put(8, new int[][]{{370, 1644, 866, 2118}, {921, 582, 1139, 1103}, {1618, 847, 1841, 1076}, {1942, 919, 2312, 1260}, {2170, 459, 2445, 817}});
        GAME_LEVEL_COORDINATE.put(9, new int[][]{{797, 1488, 1012, 1730}, {875, 378, 1169, 732}, {1015, 1804, 1259, 2104}, {1356, 255, 1583, 575}, {1438, 1512, 1841, 1886}});
        GAME_LEVEL_COORDINATE.put(10, new int[][]{{744, 204, 984, 545}, {778, 1442, 1142, 1797}, {1309, 1469, 1513, 1875}, {1629, 1053, 1876, 1394}, {2172, 480, 2403, 821}});
        GAME_LEVEL_COORDINATE.put(11, new int[][]{{97, 1316, 320, 1786}, {649, 306, 972, 641}, {1370, 426, 1651, 699}, {2039, 1449, 2308, 1684}, {2146, 1070, 2432, 1398}});
        GAME_LEVEL_COORDINATE.put(12, new int[][]{{241, 1219, 413, 1631}, {655, 1730, 904, 2019}, {1231, 486, 1444, 800}, {1277, 895, 1490, 1246}, {1490, 1621, 1816, 1968}});
        GAME_LEVEL_COORDINATE.put(13, new int[][]{{329, 40, 836, 504}, {652, 514, 1197, 975}, {1020, 930, 1408, 1336}, {1113, 1763, 1343, 2090}, {1646, 692, 2311, 1169}});
        GAME_LEVEL_COORDINATE.put(14, new int[][]{{156, 1113, 314, 1291}, {278, 521, 426, 682}, {713, 907, 929, 1105}, {903, 1311, 1166, 1526}, {1219, 541, 1372, 764}});
        GAME_LEVEL_COORDINATE.put(15, new int[][]{{355, 152, 532, 356}, {440, 696, 760, 900}, {768, 1238, 959, 1486}, {893, 802, 1151, 1107}, {887, 546, 1041, 770}});
        GAME_LEVEL_COORDINATE.put(16, new int[][]{{92, 1503, 368, 2022}, {543, 975, 744, 1350}, {1775, 508, 2066, 722}, {1796, 722, 1959, 883}, {1726, 1473, 2037, 1899}});
        GAME_LEVEL_COORDINATE.put(17, new int[][]{{74, 2966, 290, 3355}, {471, 1401, 793, 1681}, {984, 3850, 1195, 4099}, {1417, 1179, 1700, 1483}, {2203, 1480, 2445, 1814}});
        GAME_LEVEL_COORDINATE.put(18, new int[][]{{1005, 2973, 1240, 3364}, {1104, 1713, 1324, 2036}, {1595, 3248, 1849, 3616}, {1941, 2377, 2267, 2724}, {2349, 1317, 2514, 1621}});
        GAME_LEVEL_COORDINATE.put(19, new int[][]{{285, 3901, 607, 4215}, {607, 1367, 837, 1752}, {1006, 98, 1342, 460}, {1678, 774, 2087, 1091}, {1647, 1282, 2010, 1650}});
        GAME_LEVEL_COORDINATE.put(20, new int[][]{{258, 3226, 466, 3635}, {808, 2315, 1049, 2571}, {885, 1616, 1180, 1896}, {1192, 1244, 1487, 1739}, {1918, 4180, 2177, 4446}});
        GAME_LEVEL_COORDINATE.put(21, new int[][]{{1370, 64, 1712, 258}, {1605, 735, 2012, 1113}, {1309, 1147, 1571, 1573}, {2041, 1171, 2420, 1614}, {1471, 4144, 2454, 4331}});
        GAME_LEVEL_COORDINATE.put(22, new int[][]{{65, 1222, 327, 1675}, {138, 701, 552, 1273}, {999, 95, 1406, 504}, {1180, 1505, 1442, 1845}, {1544, 493, 1889, 1120}});
        GAME_LEVEL_COORDINATE.put(23, new int[][]{{563, 183, 1127, 769}, {999, 885, 1378, 1113}, {728, 1552, 1238, 1937}, {1195, 1052, 1703, 1726}, {1886, 1147, 2271, 1947}});
        GAME_LEVEL_COORDINATE.put(24, new int[][]{{109, 685, 511, 1220}, {322, 252, 853, 893}, {1195, 146, 1469, 542}, {1132, 1210, 1440, 1643}, {1692, 937, 2003, 1418}});
        GAME_LEVEL_COORDINATE.put(25, new int[][]{{404, 995, 701, 1401}, {989, 235, 1212, 572}, {1335, 1057, 1625, 1462}, {1287, 1445, 1528, 1824}, {2097, 88, 2470, 422}});
        GAME_LEVEL_COORDINATE.put(26, new int[][]{{49, 190, 231, 538}, {673, 650, 905, 1001}, {890, 525, 1151, 838}, {1538, 55, 1858, 259}, {1649, 326, 1910, 608}});
        GAME_LEVEL_COORDINATE.put(27, new int[][]{{149, 1014, 420, 1314}, {988, 1254, 1293, 1426}, {1338, 1169, 1591, 1448}, {1697, 1088, 1912, 1372}, {1427, 35, 1765, 315}});
        GAME_LEVEL_COORDINATE.put(28, new int[][]{{40, 89, 251, 373}, {459, 20, 651, 154}, {420, 107, 838, 288}, {625, 715, 927, 958}, {190, 1041, 479, 1350}});
        GAME_LEVEL_COORDINATE.put(29, new int[][]{{40, 482, 236, 704}, {148, 777, 377, 1037}, {616, 1209, 871, 1390}, {1075, 675, 1367, 1075}, {1230, 38, 1536, 216}});
        GAME_LEVEL_COORDINATE.put(30, new int[][]{{0, 704, 305, 981}, {292, 261, 538, 525}, {838, 460, 1069, 751}, {1323, 719, 1725, 954}, {1739, 35, 1921, 214}});
        GAME_LEVEL_COORDINATE.put(31, new int[][]{{99, 1285, 327, 1430}, {409, 402, 605, 675}, {547, 558, 768, 753}, {1284, 1274, 1536, 1428}, {1630, 40, 1899, 192}});
        GAME_LEVEL_COORDINATE.put(32, new int[][]{{61, 724, 390, 976}, {275, 62, 510, 263}, {260, 1097, 566, 1394}, {1147, 1066, 1521, 1361}, {1632, 438, 1862, 661}});
        GAME_LEVEL_COORDINATE.put(33, new int[][]{{453, 1057, 653, 1267}, {584, 413, 856, 757}, {912, 485, 1192, 755}, {1140, 1052, 1534, 1321}, {1578, 1119, 1823, 1374}});
        GAME_LEVEL_COORDINATE.put(34, new int[][]{{29, 494, 251, 882}, {77, 1294, 333, 1441}, {812, 239, 1073, 543}, {1279, 225, 1530, 496}, {1745, 1296, 1928, 1437}});
        GAME_LEVEL_COORDINATE.put(35, new int[][]{{979, 266, 1221, 464}, {314, 415, 653, 706}, {1543, 525, 1754, 728}, {868, 768, 1160, 1178}, {779, 1086, 1001, 1403}});
        GAME_LEVEL_COORDINATE.put(36, new int[][]{{40, 1077, 229, 1321}, {442, 677, 677, 952}, {649, 409, 819, 699}, {845, 876, 1080, 1124}, {1649, 976, 1871, 1307}});
        GAME_LEVEL_COORDINATE.put(37, new int[][]{{25, 80, 212, 487}, {338, 990, 603, 1430}, {770, 40, 999, 250}, {825, 713, 1112, 1030}, {1639, 46, 1875, 402}});
        GAME_LEVEL_COORDINATE.put(38, new int[][]{{79, 169, 303, 496}, {57, 652, 286, 979}, {644, 163, 903, 480}, {470, 406, 801, 708}, {673, 909, 919, 1318}});
        GAME_LEVEL_COORDINATE.put(39, new int[][]{{24, 912, 199, 1200}, {279, 451, 490, 858}, {1038, 58, 1469, 210}, {1184, 811, 1393, 1084}, {1395, 1057, 1619, 1254}});
        GAME_LEVEL_COORDINATE.put(40, new int[][]{{386, 648, 644, 1048}, {755, 205, 1008, 552}, {845, 556, 1071, 903}, {1132, 681, 1462, 1059}, {1586, 1184, 1832, 1419}});
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
        GAME_LEVEL_COORDINATE.put(99, new int[][]{{280, 410, 490, 730}, {590, 500, 730, 700}, {60, 1130, 530, 1260}, {490, 1440, 1180, 159,0}, {1760, 290, 1880, 490}});
        GAME_LEVEL_COORDINATE.put(100, new int[][]{{20, 20, 200, 260}, {850, 20, 1080, 260}, {1100, 980, 1240, 1150}, {1440, 530, 1555, 755}, {350, 1055, 680, 1185}});
    }
}
