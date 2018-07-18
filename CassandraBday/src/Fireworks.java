import java.awt.*;
import cassie.basic.*;

public class Fireworks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//create a drawing panel
		DrawingPanel panel = new DrawingPanel(PointConstants.SIZE* PointConstants.PIXELS,
				PointConstants.SIZE * PointConstants.PIXELS);
		Graphics g = panel.getGraphics();

		//create several birds
		PointSS[] letterA = {
				new RedPoint(16, 4), new CyanPoint(8,4),
				new MagentaPoint(15, 5), new MagentaPoint(17, 5),
				new BluePoint(14, 6), new BluePoint(18, 6),
				new BlackPoint(14, 7), new BlackPoint(15, 7), new BlackPoint(16, 7), new BlackPoint(17, 7), new BlackPoint(18, 7),
				new RedPoint(14,8), new RedPoint(15, 8), new RedPoint(16, 8), new RedPoint(17, 8), new RedPoint(18, 8),
				new GreenPoint(14,9), new GreenPoint(18, 9),
				new PinkPoint(14,10), new PinkPoint(18, 10),
				new MagentaPoint(14, 11), new MagentaPoint(18, 11),
				new BluePoint(14, 12), new BluePoint(18, 12),
				new BlackPoint(14, 13), new BlackPoint(18, 13),
		};
		PointSS[] letterA2 = {
				new RedPoint(36, 4),
				new MagentaPoint(35, 5), new MagentaPoint(37, 5),
				new BluePoint(34, 6), new BluePoint(38, 6),
				new BlackPoint(34, 7), new BlackPoint(35, 7), new BlackPoint(36, 7), new BlackPoint(37, 7), new BlackPoint(38, 7),
				new RedPoint(34,8), new RedPoint(35, 8), new RedPoint(36, 8), new RedPoint(37, 8), new RedPoint(38, 8),
				new GreenPoint(34,9), new GreenPoint(38, 9),
				new PinkPoint(34,10), new PinkPoint(38, 10),
				new MagentaPoint(34, 11), new MagentaPoint(38, 11),
				new BluePoint(34, 12), new BluePoint(38, 12),
				new BlackPoint(34, 13), new BlackPoint(38, 13),
		};
		PointSS[] letterA3 = {
				new RedPoint(67, 4), 
				new MagentaPoint(66, 5), new MagentaPoint(68, 5),
				new BluePoint(65, 6), new BluePoint(69, 6),
				new BlackPoint(65, 7), new BlackPoint(66, 7), new BlackPoint(67, 7), new BlackPoint(68, 7), new BlackPoint(69, 7),
				new RedPoint(65,8), new RedPoint(66, 8), new RedPoint(67, 8), new RedPoint(68, 8), new RedPoint(69, 8),
				new GreenPoint(65,9), new GreenPoint(69, 9),
				new PinkPoint(65,10), new PinkPoint(69, 10),
				new MagentaPoint(65, 11), new MagentaPoint(69, 11),
				new BluePoint(65, 12), new BluePoint(69, 12),
				new BlackPoint(65, 13), new BlackPoint(69, 13),
		};
		PointSS[] letterA4 = {
				new RedPoint(16, 15),
				new MagentaPoint(15, 16), new MagentaPoint(17, 16),
				new BluePoint(14, 17), new BluePoint(18, 17),
				new BlackPoint(14, 18), new BlackPoint(15, 18), new BlackPoint(16, 18), new BlackPoint(17, 18), new BlackPoint(18, 18),
				new RedPoint(14,19), new RedPoint(15, 19), new RedPoint(16, 19), new RedPoint(17, 19), new RedPoint(18, 19),
				new GreenPoint(14,20), new GreenPoint(18, 20),
				new PinkPoint(14,21), new PinkPoint(18, 21),
				new MagentaPoint(14, 22), new MagentaPoint(18, 22),
				new BluePoint(14, 23), new BluePoint(18, 23),
				new BlackPoint(14, 24), new BlackPoint(18, 24),
		};
		PointSS[] letterA5 = {
				new RedPoint(66, 15),
				new MagentaPoint(65, 16), new MagentaPoint(67, 16),
				new BluePoint(64, 17), new BluePoint(68, 17),
				new BlackPoint(64, 18), new BlackPoint(65, 18), new BlackPoint(66, 18), new BlackPoint(67, 18), new BlackPoint(68, 18),
				new RedPoint(64,19), new RedPoint(65, 19), new RedPoint(66, 19), new RedPoint(67, 19), new RedPoint(68, 19),
				new GreenPoint(64,20), new GreenPoint(68, 20),
				new PinkPoint(64,21), new PinkPoint(68, 21),
				new MagentaPoint(64, 22), new MagentaPoint(68, 22),
				new BluePoint(64, 23), new BluePoint(68, 23),
				new BlackPoint(64, 24), new BlackPoint(68, 24),
		};
		PointSS[] letterB = {
				new RedPoint(49,15), new RedPoint(50, 15), new RedPoint(51, 15), new RedPoint(52, 15), new RedPoint(53, 15),
				new MagentaPoint(49, 16), new MagentaPoint(50, 16), new MagentaPoint(53, 16), new MagentaPoint(54, 16),
				new BluePoint(49, 17), new BluePoint(50, 17), new BluePoint(54, 17),
				new BlackPoint(49, 18), new BlackPoint(50, 18), new BlackPoint(54, 18),
				new RedPoint(49,19), new RedPoint(50, 19), new RedPoint(51, 19), new RedPoint(52, 19), new RedPoint(53, 19),
				new GreenPoint(49,20), new GreenPoint(50, 20), new GreenPoint(51, 20), new GreenPoint(52, 20), new GreenPoint(53, 20),
				new PinkPoint(49,21), new PinkPoint(50, 21), new PinkPoint(54, 21),
				new MagentaPoint(49, 22), new MagentaPoint(50, 22), new MagentaPoint(54, 22),
				new BluePoint(49, 23), new BluePoint(50, 23), new BluePoint(53, 23), new BluePoint(54, 23),
				new BlackPoint(49, 24), new BlackPoint(50, 24), new BlackPoint(51, 24), new BlackPoint(52, 24), new BlackPoint(53, 24)
		};
		PointSS[] letterC = {
				new RedPoint(7,4), new RedPoint(8, 4), new RedPoint(9, 4), new RedPoint(10, 4), new RedPoint(11, 4), new RedPoint(12, 4),
				new MagentaPoint(7, 5), new MagentaPoint(8, 5), new MagentaPoint(9, 5), new MagentaPoint(10, 5), new MagentaPoint(11, 5), new RedPoint(12, 5),
				new BluePoint(7, 6), new BluePoint(8, 6), new BluePoint(9, 6), new RedPoint(12, 6),
				new BlackPoint(7, 7), new BlackPoint(8, 7), new BlackPoint(9, 7), 
				new RedPoint(7,8), new RedPoint(8, 8), new RedPoint(9, 8), new CyanPoint(2,4), 
				new GreenPoint(7,9), new GreenPoint(8, 9), new GreenPoint(9, 9),
				new PinkPoint(7,10), new PinkPoint(8, 10), new PinkPoint(9, 10),
				new MagentaPoint(7, 11), new MagentaPoint(8, 11), new MagentaPoint(9, 11), new BlackPoint(12, 11),
				new BluePoint(7, 12), new BluePoint(8, 12), new BluePoint(9, 12), new BluePoint(10, 12), new BluePoint(11, 12), new BlackPoint(12, 12),
				new BlackPoint(7, 13), new BlackPoint(8, 13), new BlackPoint(9, 13), new BlackPoint(10, 13), new BlackPoint(11, 13), new BlackPoint(12, 13)
		};
		PointSS[] letterD = {
				new RedPoint(49,4), new RedPoint(50, 4), new RedPoint(51, 4), new RedPoint(52, 4), new RedPoint(53, 4),
				new MagentaPoint(49, 5), new MagentaPoint(50, 5), new MagentaPoint(51, 5), new MagentaPoint(52, 5), new MagentaPoint(53, 5), new MagentaPoint(54, 5),
				new BluePoint(49, 6), new BluePoint(50, 6), new BluePoint(51, 6), new BluePoint(54, 6), new BluePoint(55, 6),
				new BlackPoint(49, 7), new BlackPoint(50, 7), new BlackPoint(54, 7), new BlackPoint(55, 7), 
				new RedPoint(49,8), new RedPoint(50, 8), new RedPoint(55, 8), new CyanPoint(62,4),
				new GreenPoint(49,9), new GreenPoint(50, 9), new GreenPoint(55, 9),
				new PinkPoint(49,10), new PinkPoint(50, 10), new PinkPoint(54, 10), new PinkPoint(55, 10),
				new MagentaPoint(49, 11), new MagentaPoint(50, 11), new MagentaPoint(54, 11), new MagentaPoint(55, 11),
				new BluePoint(49, 12), new BluePoint(50, 12), new BluePoint(53, 12), new BluePoint(54, 12),
				new BlackPoint(49, 13), new BlackPoint(50, 13), new BlackPoint(51, 13), new BlackPoint(52, 13), new BlackPoint(53, 13)
		};
		PointSS[] letterD2 = {
				new RedPoint(56,15), new RedPoint(57, 15), new RedPoint(58, 15), new RedPoint(59, 15), new RedPoint(60, 15),
				new MagentaPoint(56, 16), new MagentaPoint(57, 16), new MagentaPoint(58, 16), new MagentaPoint(59, 16), new MagentaPoint(60, 16), new MagentaPoint(61, 16),
				new BluePoint(56, 17), new BluePoint(57, 17), new BluePoint(58, 17), new BluePoint(61, 17), new BluePoint(62, 17),
				new BlackPoint(56, 18), new BlackPoint(57, 18), new BlackPoint(61, 18), new BlackPoint(62, 18), 
				new RedPoint(56,19), new RedPoint(57, 19), new RedPoint(62, 19),
				new GreenPoint(56,20), new GreenPoint(57, 20), new GreenPoint(62, 20),
				new PinkPoint(56,21), new PinkPoint(57, 21), new PinkPoint(61, 21), new PinkPoint(62, 21),
				new MagentaPoint(56, 22), new MagentaPoint(57, 22), new MagentaPoint(61, 22), new MagentaPoint(62, 22),
				new BluePoint(56, 23), new BluePoint(57, 23), new BluePoint(60, 23), new BluePoint(61, 23),
				new BlackPoint(56, 24), new BlackPoint(57, 24), new BlackPoint(58, 24), new BlackPoint(59, 24), new BlackPoint(60, 24)
		};
		PointSS[] letterH = {
				new RedPoint(7,15), new RedPoint(8, 15), new RedPoint(11, 15), new RedPoint(12, 15),
				new MagentaPoint(7, 16), new MagentaPoint(8, 16), new MagentaPoint(11, 16), new MagentaPoint(12, 16),
				new BluePoint(7, 17), new BluePoint(8, 17), new BluePoint(11, 17), new BluePoint(12, 17),
				new BlackPoint(7, 18), new BlackPoint(8, 18), new BlackPoint(11, 18), new BlackPoint(12, 18), 
				new RedPoint(7,19), new RedPoint(8, 19), new RedPoint(9, 19), new RedPoint(10, 19), new RedPoint(11, 19), new RedPoint(12, 19),
				new GreenPoint(7,20), new GreenPoint(8, 20), new GreenPoint(9, 20), new GreenPoint(10, 20), new GreenPoint(11, 20), new GreenPoint(12, 20),
				new PinkPoint(7,21), new PinkPoint(8, 21), new PinkPoint(11, 21), new PinkPoint(12, 21),
				new MagentaPoint(7, 22), new MagentaPoint(8, 22), new MagentaPoint(11, 22), new MagentaPoint(12, 22),
				new BluePoint(7, 23), new BluePoint(8, 23), new BluePoint(11, 23), new BluePoint(12, 23),
				new BlackPoint(7, 24), new BlackPoint(8, 24), new BlackPoint(11, 24), new BlackPoint(12, 24)
		};
		PointSS[] letterN = {
				new RedPoint(40,4), new RedPoint(41, 4), new RedPoint(42, 4), new RedPoint(43, 4), new RedPoint(47, 4), new CyanPoint(32,4),
				new MagentaPoint(40, 5), new MagentaPoint(41, 5), new MagentaPoint(42, 5), new MagentaPoint(43, 5), new MagentaPoint(44, 5), new MagentaPoint(47, 5),
				new BluePoint(40, 6), new BluePoint(41, 6), new BluePoint(42, 6), new BluePoint(43, 6), new BluePoint(44, 6), new BluePoint(47, 6),
				new BlackPoint(40, 7), new BlackPoint(41, 7), new BlackPoint(43, 7), new BlackPoint(44, 7), new BlackPoint(47, 7), 
				new RedPoint(40,8), new RedPoint(41, 8), new RedPoint(43, 8), new RedPoint(44, 8), new RedPoint(47, 8),
				new GreenPoint(40,9), new GreenPoint(41, 9), new GreenPoint(44, 9), new GreenPoint(45, 9), new GreenPoint(47, 9),
				new PinkPoint(40,10), new PinkPoint(41, 10), new PinkPoint(44, 10), new PinkPoint(45, 10), new PinkPoint(47, 10),
				new MagentaPoint(40, 11), new MagentaPoint(41, 11), new MagentaPoint(45, 11), new MagentaPoint(46, 11), new MagentaPoint(47, 11),
				new BluePoint(40, 12), new BluePoint(41, 12), new BluePoint(45, 12), new BluePoint(46, 12), new BluePoint(47, 12),
				new BlackPoint(40, 13), new BlackPoint(41, 13), new BlackPoint(46, 13), new BlackPoint(47, 13)
		};
		PointSS[] letterR = {
				new RedPoint(57,4), new RedPoint(58, 4), new RedPoint(59, 4), new RedPoint(60, 4), new RedPoint(61, 4), new RedPoint(62, 4), 
				new MagentaPoint(57, 5), new MagentaPoint(58, 5), new MagentaPoint(62, 5), new MagentaPoint(63, 5),
				new BluePoint(57, 6), new BluePoint(58, 6), new BluePoint(62, 6), new BluePoint(63, 6),
				new BlackPoint(57, 7), new BlackPoint(58, 7), new BlackPoint(59, 7), new BlackPoint(60, 7), new BlackPoint(61, 7), new BlackPoint(62, 7),
				new RedPoint(57,8), new RedPoint(58, 8), new RedPoint(59, 8), new RedPoint(60, 8), new RedPoint(61, 8), new RedPoint(62, 8),
				new GreenPoint(57,9), new GreenPoint(58, 9), new GreenPoint(62, 9), new GreenPoint(63, 9),
				new PinkPoint(57,10), new PinkPoint(58, 10), new PinkPoint(63, 10),
				new MagentaPoint(57, 11), new MagentaPoint(58, 11), new MagentaPoint(63, 11),
				new BluePoint(57, 12), new BluePoint(58, 12), new BluePoint(63, 12),
				new BlackPoint(57, 13), new BlackPoint(58, 13), new BlackPoint(63, 13)
		};
		PointSS[] letterP = {
				new RedPoint(20,15), new RedPoint(21, 15), new RedPoint(22, 15), new RedPoint(23, 15), new RedPoint(24, 15),
				new MagentaPoint(20, 16), new MagentaPoint(21, 16), new MagentaPoint(24, 16), new MagentaPoint(25, 16),
				new BluePoint(20, 17), new BluePoint(21, 17), new BluePoint(25, 17),
				new BlackPoint(20, 18), new BlackPoint(21, 18), new BlackPoint(25, 18), 
				new RedPoint(20, 19), new RedPoint(21, 19), new RedPoint(24, 19), new RedPoint(25,19),
				new GreenPoint(20, 20), new GreenPoint(21, 20), new GreenPoint(22, 20), new GreenPoint(23,20), new GreenPoint(24, 20), 
				new PinkPoint(20, 21), new PinkPoint(21,21),
				new MagentaPoint(20, 22), new MagentaPoint(21, 22),
				new BluePoint(20, 23), new BluePoint(21, 23),
				new BlackPoint(20, 24), new BlackPoint(21, 24)
		};
		PointSS[] letterP2 = {
				new RedPoint(27,15), new RedPoint(28, 15), new RedPoint(29, 15), new RedPoint(30, 15), new RedPoint(31, 15),
				new MagentaPoint(27, 16), new MagentaPoint(28, 16), new MagentaPoint(31, 16), new MagentaPoint(32, 16),
				new BluePoint(27, 17), new BluePoint(28, 17), new BluePoint(32, 17),
				new BlackPoint(27, 18), new BlackPoint(28, 18), new BlackPoint(32, 18), 
				new RedPoint(27, 19), new RedPoint(28, 19), new RedPoint(31, 19), new RedPoint(32,19),
				new GreenPoint(27, 20), new GreenPoint(28, 20), new GreenPoint(29, 20), new GreenPoint(30,20), new GreenPoint(31, 20), 
				new PinkPoint(27, 21), new PinkPoint(28,21),
				new MagentaPoint(27, 22), new MagentaPoint(28, 22),
				new BluePoint(27, 23), new BluePoint(28, 23),
				new BlackPoint(27, 24), new BlackPoint(28, 24)
		};
		PointSS[] letterS = {
				new RedPoint(20,4), new RedPoint(21, 4), new RedPoint(22, 4), new RedPoint(23, 4), new RedPoint(24, 4), new RedPoint(25, 4),
				new MagentaPoint(20, 5), new MagentaPoint(21, 5), new MagentaPoint(22, 5), new MagentaPoint(23, 5), new MagentaPoint(24, 5), new RedPoint(25, 5),
				new BluePoint(20, 6), new BluePoint(21, 6), new BluePoint(22, 6), new RedPoint(25, 6),
				new BlackPoint(21, 7), new BlackPoint(22, 7), new BlackPoint(23, 7), 
				new RedPoint(21, 8), new RedPoint(22, 8), new RedPoint(23,8),
				new GreenPoint(22, 9), new GreenPoint(23,9), new GreenPoint(24, 9), 
				new PinkPoint(22, 10), new PinkPoint(23,10), new PinkPoint(24, 10),
				new BlackPoint(20, 11), new MagentaPoint(22, 11), new MagentaPoint(23, 11), new MagentaPoint(24, 11), new MagentaPoint(25, 11),
				new BlackPoint(20, 12), new BluePoint(21, 12), new BluePoint(22, 12), new BluePoint(23, 12), new BluePoint(24, 12), new BluePoint(25, 12), 
				new BlackPoint(20, 13), new BlackPoint(21, 13), new BlackPoint(22, 13), new BlackPoint(23, 13), new BlackPoint(24, 13), new BlackPoint(25, 13),
		};
		PointSS[] letterS2 = {
				new RedPoint(27,4), new RedPoint(28, 4), new RedPoint(29, 4), new RedPoint(30, 4), new RedPoint(31, 4), new RedPoint(32, 4),
				new MagentaPoint(27, 5), new MagentaPoint(28, 5), new MagentaPoint(29, 5), new MagentaPoint(30, 5), new MagentaPoint(31, 5), new RedPoint(32, 5),
				new BluePoint(27, 6), new BluePoint(28, 6), new BluePoint(29, 6), new RedPoint(32, 6),
				new BlackPoint(28, 7), new BlackPoint(29, 7), new BlackPoint(30, 7), 
				new RedPoint(28, 8), new RedPoint(29, 8), new RedPoint(30,8), new CyanPoint(51,4),
				new GreenPoint(29, 9), new GreenPoint(30,9), new GreenPoint(31, 9), 
				new PinkPoint(29, 10), new PinkPoint(30,10), new PinkPoint(31, 10),
				new BlackPoint(27, 11), new MagentaPoint(29, 11), new MagentaPoint(30, 11), new MagentaPoint(31, 11), new MagentaPoint(32, 11),
				new BlackPoint(27, 12), new BluePoint(28, 12), new BluePoint(29, 12), new BluePoint(30, 12), new BluePoint(31, 12), new BluePoint(32, 12), 
				new BlackPoint(27, 13), new BlackPoint(28, 13), new BlackPoint(29, 13), new BlackPoint(30, 13), new BlackPoint(31, 13), new BlackPoint(32, 13),
		};
		PointSS[] letterY = {
				new RedPoint(34, 15), new RedPoint(39, 15),
				new MagentaPoint(34, 16), new MagentaPoint(39, 16),
				new BluePoint(34, 17), new BluePoint(39, 17),
				new BlackPoint(35, 18), new BlackPoint(38, 18),
				new RedPoint(36,19), new RedPoint(37, 19),
				new GreenPoint(36,20), new GreenPoint(37, 20),
				new PinkPoint(36,21), new PinkPoint(37, 21),
				new MagentaPoint(36, 22), new MagentaPoint(37, 22),
				new BluePoint(36, 23), new BluePoint(37, 23),
				new BlackPoint(36, 24), new BlackPoint(37, 24),
		};
		PointSS[] letterY2 = {
				new RedPoint(70, 15), new RedPoint(75, 15),
				new MagentaPoint(70, 16), new MagentaPoint(75, 16),
				new BluePoint(70, 17), new BluePoint(75, 17),
				new BlackPoint(71, 18), new BlackPoint(74, 18),
				new RedPoint(72,19), new RedPoint(73, 19),
				new GreenPoint(72,20), new GreenPoint(73, 20),
				new PinkPoint(72,21), new PinkPoint(73, 21),
				new MagentaPoint(72, 22), new MagentaPoint(73, 22),
				new BluePoint(72, 23), new BluePoint(73, 23),
				new BlackPoint(72, 24), new BlackPoint(73, 24),
		};
		PointSS[] exclamationP = {
				new RedPoint(71,4), new RedPoint(72, 4),
				new MagentaPoint(71, 5), new MagentaPoint(72, 5),
				new BluePoint(71, 6), new BluePoint(72, 6),
				new BlackPoint(71, 7), new BlackPoint(72, 7), 
				new RedPoint(71,8), new RedPoint(72, 8), new CyanPoint(34,11),
				new GreenPoint(71,9), new GreenPoint(72, 9),
				new PinkPoint(71,10), new PinkPoint(72, 10),
				new BluePoint(71, 12), new BluePoint(72, 12), 
				new BlackPoint(71, 13), new BlackPoint(72, 13),
		};
		PointSS[] exclamationP2 = {
				new RedPoint(74,4), new RedPoint(75, 4),
				new MagentaPoint(74, 5), new MagentaPoint(75, 5),
				new BluePoint(74, 6), new BluePoint(75, 6),
				new BlackPoint(74, 7), new BlackPoint(75, 7), 
				new RedPoint(74,8), new RedPoint(75, 8), new CyanPoint(47,10),
				new GreenPoint(74,9), new GreenPoint(75, 9),
				new PinkPoint(74,10), new PinkPoint(75, 10),
				new BluePoint(74, 12), new BluePoint(75, 12), 
				new BlackPoint(74, 13), new BlackPoint(75, 13),
		};
		PointSS[] cake = {
				new RedPoint(42, 26), new RedPoint(44, 26), 
				new MagentaPoint(42, 27), new MagentaPoint(44, 27), 
				new BluePoint(42, 28), new BluePoint(44, 28),
				new CyanPoint2(40, 29), new CyanPoint2(41, 29), new CyanPoint2(42, 29), new CyanPoint2(43, 29), new CyanPoint2(44, 29), new CyanPoint2(45, 29), new CyanPoint2(46, 29),
				new RedPoint(40,30), new RedPoint(41,30), new RedPoint(42,30), new RedPoint(43, 30), new RedPoint(44,30), new RedPoint(45,30), new RedPoint(46,30), 
				new CyanPoint2(40,31), new CyanPoint2(41,31), new CyanPoint2(42,31), new CyanPoint2(43, 31), new CyanPoint2(44,31), new CyanPoint2(45,31), new CyanPoint2(46,31),
				new RedPoint(40,32), new RedPoint(41,32), new RedPoint(42,32), new RedPoint(43, 32), new RedPoint(44,32), new RedPoint(45,32), new RedPoint(46,32), 
				new CyanPoint2(40, 33), new CyanPoint2(41, 33), new CyanPoint2(42, 33), new CyanPoint2(43, 33), new CyanPoint2(44, 33), new CyanPoint2(45, 33), new CyanPoint2(46, 33),
				new RedPoint(40, 34), new RedPoint(41, 34), new RedPoint(42, 34), new RedPoint(43, 34), new RedPoint(44, 34), new RedPoint(45, 34), new RedPoint(46,34), 
				new CyanPoint2(40, 35), new CyanPoint2(41, 35), new CyanPoint2(42, 35), new CyanPoint2(43, 35), new CyanPoint2(44, 35), new CyanPoint2(45, 35), new CyanPoint2(46, 35)
		};
		PointSS[] heart = {
				new GreenPoint(49,27), new GreenPoint(50,27), new GreenPoint(52,27), new GreenPoint(53,27),
				new GreenPoint(48,28), new GreenPoint(49,28), new GreenPoint(50,28), new GreenPoint(51,28), new GreenPoint(52,28), new GreenPoint(53,28), new GreenPoint(54,28),
				new GreenPoint(48,29), new GreenPoint(49,29), new GreenPoint(50,29), new GreenPoint(51,29), new GreenPoint(52,29), new GreenPoint(53,29), new GreenPoint(54,29),
				new GreenPoint(48,30), new GreenPoint(49,30), new GreenPoint(50,30), new GreenPoint(51,30), new GreenPoint(52,30), new GreenPoint(53,30), new GreenPoint(54,30),
				new GreenPoint(49,31), new GreenPoint(50,31), new GreenPoint(51,31), new GreenPoint(52,31), new GreenPoint(53,31),
				new GreenPoint(49,32), new GreenPoint(50,32), new GreenPoint(51,32), new GreenPoint(52,32), new GreenPoint(53,32),
				new GreenPoint(50,33), new GreenPoint(51,33), new GreenPoint(52,33),
				new GreenPoint(50,34), new GreenPoint(51,34), new GreenPoint(52,34),
				new GreenPoint(51,35)
		};
		
		while (true) {
			// clear screen
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, PointConstants.SIZE* PointConstants.PIXELS,
					PointConstants.SIZE* PointConstants.PIXELS);

			// tell each bird to fly and redraw the bird
			//for (Bird bird: birds) {
			for (int i=0; i<letterC.length;i++){
				PointSS bird = letterC[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterA.length;i++){
				PointSS bird = letterA[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterS.length;i++){
				PointSS bird = letterS[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterS2.length;i++){
				PointSS bird = letterS2[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterA2.length;i++){
				PointSS bird = letterA2[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterN.length;i++){
				PointSS bird = letterN[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterD.length;i++){
				PointSS bird = letterD[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterR.length;i++){
				PointSS bird = letterR[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterA3.length;i++){
				PointSS bird = letterA3[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<exclamationP.length;i++){
				PointSS bird = exclamationP[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<exclamationP2.length;i++){
				PointSS bird = exclamationP2[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterH.length;i++){
				PointSS bird = letterH[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterA4.length;i++){
				PointSS bird = letterA4[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterP.length;i++){
				PointSS bird = letterP[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterP2.length;i++){
				PointSS bird = letterP2[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterY.length;i++){
				PointSS bird = letterY[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterB.length;i++){
				PointSS bird = letterB[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterD2.length;i++){
				PointSS bird = letterD2[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterA5.length;i++){
				PointSS bird = letterA5[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<letterY2.length;i++){
				PointSS bird = letterY2[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<cake.length;i++){
				PointSS bird = cake[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			for (int i=0; i<heart.length;i++){
				PointSS bird = heart[i];
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* PointConstants.PIXELS, (int) pos.getY()* PointConstants.PIXELS,
						PointConstants.PIXELS, PointConstants.PIXELS);

			}
			panel.sleep(500);
		}
	}
}

