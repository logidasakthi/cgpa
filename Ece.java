package ecepack;
import prograde.gradepro;
import java.util.*;
public class Ece{
	static Scanner s=new Scanner(System.in);
	static String G1,G2,G3,G4,G5,G6,G7,G8,G9;
	static int g1,g2,g3,g4,g5,g6,g7,g8,g9;
	static double gpa;
	public static double sem1()
	{
		System.out.println("1st sem grade");
		System.out.println("HS8151 Communicative English");
		G1=s.next();
		g1=gradepro.grade(G1);
		System.out.println("MA8151 Engineering  Mathematics – 1");
		G2=s.next();
		g2=gradepro.grade(G2);
		System.out.println("PH8151 Engineering Physics");
		G3=s.next();
		g3=gradepro.grade(G3);
		System.out.println("CY8151 Engineering Chemistry");
		G4=s.next();
		g4=gradepro.grade(G4);
		System.out.println("GE8151 Problem Solving and Python Programming");
		G5=s.next();
		g5=gradepro.grade(G5);
		System.out.println("GE8152 Engineering Graphics");
		G6=s.next();
		g6=gradepro.grade(G6);
		System.out.println("GE8161 Problem Solving and Python Programming");
		G7=s.next();
		g7=gradepro.grade(G7);
		System.out.println("BS8161 Physics and Chemistry Laboratory");
		G8=s.next();
		g8=gradepro.grade(G8);
		gpa=(g1*4+g2*4+g3*3+g4*3+g5*3+g6*4+g7*2+g8*2)/25;
		return gpa;
	}
	public static double sem2()
	{
		System.out.println("2nd sem grade");
		System.out.println("MA8251 Engineering Mathematics-2");
		G1=s.next();
		g1=gradepro.grade(G1);
		System.out.println("HS8251 Technical English");
		G2=s.next();
		g2=gradepro.grade(G2);
		System.out.println("PH8253 Physics For Electronics Engineering");
		G3=s.next();
		g3=gradepro.grade(G3);
		System.out.println("BE8254 Basic Electrical and Instrumentation Engineering");
		G4=s.next();
		g4=gradepro.grade(G4);
		System.out.println("EC8251 Circuit Analysis");
		G5=s.next();
		g5=gradepro.grade(G5);
		System.out.println("EC8252 Electronic Devices");
		G6=s.next();
		g6=gradepro.grade(G6);
		System.out.println("EC8261 Circuit And Devices laboratory");
		G7=s.next();
		g7=gradepro.grade(G7);
		System.out.println("GE8261 Engineering Practices Laboratory");
		G8=s.next();
		g8=gradepro.grade(G8);
		gpa=(g1*4+g2*4+g3*3+g4*3+g5*4+g6*3+g7*2+g8*2)/25;
		return gpa;
	}
	public static double sem3()
	{
		System.out.println("3rd sem grade");
		System.out.println("MA8352 Linear Algebra & Partial Differential Equation");
		G1=s.next();
		g1=gradepro.grade(G1);
		System.out.println("EC8393 Fundamentals Of Data Structures In C");
		G2=s.next();
		g2=gradepro.grade(G2);
		System.out.println("EC8351 Electronic Circuits - 1");
		G3=s.next();
		g3=gradepro.grade(G3);
		System.out.println("EC8352 Signals And Systems");
		G4=s.next();
		g4=gradepro.grade(G4);
		System.out.println("EC8392 Digital Electronics");
		G5=s.next();
		g5=gradepro.grade(G5);
		System.out.println("EC8391 Control Systems Engineering");
		G6=s.next();
		g6=gradepro.grade(G6);
		System.out.println("EC8381 Fundamentals Of Data Structures In C Laboratory");
		G7=s.next();
		g7=gradepro.grade(G7);
		System.out.println("EC8361 Analog and Digital Circuits Laboratory");
		G8=s.next();
		g8=gradepro.grade(G8);
		System.out.println("HS8381 Interpersonal Skills/Listening & Speaking");
		G9=s.next();
		g9=gradepro.grade(G9);
		gpa=(g1*4+g2*3+g3*3+g4*4+g5*3+g6*3+g7*2+g8*2+g9*1)/25;
		return gpa;
	}
	public static double sem4()
	{
		System.out.println("4th sem grade");
		System.out.println(" MA8451 Probability And Random Processes");
		G1=s.next();
		g1=gradepro.grade(G1);
		System.out.println("EC8452 Electronic Circuits - 2");
		G2=s.next();
		g2=gradepro.grade(G2);
		System.out.println(" EC8491 Communication Theory");
		G3=s.next();
		g3=gradepro.grade(G3);
		System.out.println("EC8451 Electromagnetic Fields");
		G4=s.next();
		g4=gradepro.grade(G4);
		System.out.println("EC8453 Linear Integrated Circuits");
		G5=s.next();
		g5=gradepro.grade(G5);
		System.out.println("GE8291 Environmental Science And Engineering ");
		G6=s.next();
		g6=gradepro.grade(G6);
		System.out.println("EC8461 Circuit Design and Simulation Laboratory");
		G7=s.next();
		g7=gradepro.grade(G7);
		System.out.println("EC8462 Linear Integrated Circuits Laboratory");
		G8=s.next();
		g8=gradepro.grade(G8);
		gpa=(g1*4+g2*3+g3*3+g4*4+g5*3+g6*3+g7*2+g8*2)/24;
		return gpa;
	}
	public static double sem5()
	{
		System.out.println("5th sem grade");
		System.out.println("EC8501 Digital Communication");
		G1=s.next();
		g1=gradepro.grade(G1);
		System.out.println("EC8553 Discrete - Time Signal  Processing");
		G2=s.next();
		g2=gradepro.grade(G2);
		System.out.println("EC8552 Computer Architecture And Organisation");
		G3=s.next();
		g3=gradepro.grade(G3);
		System.out.println("EC8551 Communication Networks");
		G4=s.next();
		g4=gradepro.grade(G4);
		System.out.println(" Professional Elective - 1");
		G5=s.next();
		g5=gradepro.grade(G5);
		System.out.println(" Open Elective - 1");
		G6=s.next();
		g6=gradepro.grade(G6);
		System.out.println("EC8562 Digital Signal Processing Laboratory");
		G7=s.next();
		g7=gradepro.grade(G7);
		System.out.println("EC8561 Communication Systems Laboratory ");
		G8=s.next();
		g8=gradepro.grade(G8);
		System.out.println("HS8563 Communication Networks Laboratory ");
		G9=s.next();
		g9=gradepro.grade(G9);
		gpa=(g1*3+g2*4+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2+g9*2)/25;
		return gpa;
	}
	public static double sem6()
	{
		System.out.println("6th sem grade");
		System.out.println("EC8691 Microprocessors And Microcontrollers");
		G1=s.next();
		g1=gradepro.grade(G1);
		System.out.println("EC8095 VLSI Design");
		G2=s.next();
		g2=gradepro.grade(G2);
		System.out.println("EC8652 Wireless Communication ");
		G3=s.next();
		g3=gradepro.grade(G3);
		System.out.println("MG8591 Principles Of Management ");
		G4=s.next();
		g4=gradepro.grade(G4);
		System.out.println(" EC8651 Transmission Lines And RF Systems");
		G5=s.next();
		g5=gradepro.grade(G5);
		System.out.println(" Professional Elective - 2");
		G6=s.next();
		g6=gradepro.grade(G6);
		System.out.println("EC8681 Microprocessors And Microcontrollers Laboratory ");
		G7=s.next();
		g7=gradepro.grade(G7);
		System.out.println("EC8661 VLSI Design Laboratory");
		G8=s.next();
		g8=gradepro.grade(G8);
		System.out.println("EC8611 Technical Seminar ");
		G9=s.next();
		g9=gradepro.grade(G9);
		gpa=(g1*3+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2+g9*1)/23;
		return gpa;
	}
	public static double sem7()
	{
		System.out.println("7th sem grade");
		System.out.println(" EC8701 Antennas And Microwave Engineering");
		G1=s.next();
		g1=gradepro.grade(G1);
		System.out.println(" EC8751 Optical Communication");
		G2=s.next();
		g2=gradepro.grade(G2);
		System.out.println(" EC8791 Embedded And Real Time Systems");
		G3=s.next();
		g3=gradepro.grade(G3);
		System.out.println(" EC8702 Ad hoc And Wireless Sensor Networks");
		G4=s.next();
		g4=gradepro.grade(G4);
		System.out.println("Professional Elective - 3");
		G5=s.next();
		g5=gradepro.grade(G5);
		System.out.println("Open Elective - 2 ");
		G6=s.next();
		g6=gradepro.grade(G6);
		System.out.println(" EC8711 Embedded Laboratory");
		G7=s.next();
		g7=gradepro.grade(G7);
		System.out.println(" EC8761 Advanced Communication Laboratory");
		G8=s.next();
		g8=gradepro.grade(G8);
		gpa=(g1*3+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2)/22;
		return gpa;
	}
	public static double sem8()
	{
		System.out.println("8th sem grade");
		System.out.println("  Professional Elective - 4");
		G1=s.next();
		g1=gradepro.grade(G1);
		System.out.println("  Professional Elective -5");
		G2=s.next();
		g2=gradepro.grade(G2);
		System.out.println(" EC8811 Project Work");
		G3=s.next();
		g3=gradepro.grade(G3);
		gpa=(g1*3+g2*3+g3*10)/16;
		return gpa;
	}
}