package biomedpack;
import prograde.gradepro;
import java.util.*;
public class Bimed{
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
		System.out.println("BM8251 Engineering Mechanics For Biomedical Engineers");
		G4=s.next();
		g4=gradepro.grade(G4);
		System.out.println("BM8201 Fundamentals Of Bio Chemistry");
		G5=s.next();
		g5=gradepro.grade(G5);
		System.out.println("EC8251 Circuit Analysis");
		G6=s.next();
		g6=gradepro.grade(G6);
		System.out.println("GE8261 Engineering Practices Laboratory");
		G7=s.next();
		g7=gradepro.grade(G7);
		System.out.println("BM8211 Bio Chemistry Laboratory");
		G8=s.next();
		g8=gradepro.grade(G8);
		gpa=(g1*4+g2*4+g3*3+g4*3+g5*3+g6*4+g7*2+g8*2)/25;
		return gpa;
	}
	public static double sem3()
	{
		System.out.println("3rd sem grade");
		System.out.println("MA8352 Linear Algebra & Partial Differential Equation");
		G1=s.next();
		g1=gradepro.grade(G1);
		System.out.println("EC8352 Signals And Systems");
		G2=s.next();
		g2=gradepro.grade(G2);
		System.out.println ("BM8351 Anatomy and Human Physiology");
		G3=s.next();
		g3=gradepro.grade(G3);
		System.out.println("BM8301 Sensors And Measurements");
		G4=s.next();
		g4=gradepro.grade(G4);
		System.out.println("EC8353 Electron Devices And Circuits");
		G5=s.next();
		g5=gradepro.grade(G5);
		System.out.println("BM8302 Pathology And Microbiology");
		G6=s.next();
		g6=gradepro.grade(G6);
		System.out.println("BM8311 Pathology And Microbiology Laboratory ");
		G7=s.next();
		g7=gradepro.grade(G7);
		System.out.println("BM8312 Devices And Circuits Laboratory");
		G8=s.next();
		g8=gradepro.grade(G8);
		System.out.println("BM8313 Human Physiology Laboratory");
		G9=s.next();
		g9=gradepro.grade(G9);
		gpa=(g1*4+g2*4+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2+g9*1)/25;
		return gpa;
	}
	public static double sem4()
	{
		System.out.println("4th sem grade");
		System.out.println(" MA8391 Probability And Statistics");
		G1=s.next();
		g1=gradepro.grade(G1);
		System.out.println("BM8401 Medical Physics");
		G2=s.next();
		g2=gradepro.grade(G2);
		System.out.println(" EE8452 Basics Of Electrical Engineering");
		G3=s.next();
		g3=gradepro.grade(G3);
		System.out.println("EC8453 Linear Integrated Circuits");
		G4=s.next();
		g4=gradepro.grade(G4);
		System.out.println("GE8393 Fundamentals Of Data Structures In C ");
		G5=s.next();
		g5=gradepro.grade(G5);
		System.out.println("EC8392  Digital Electronics");
		G6=s.next();
		g6=gradepro.grade(G6);
		System.out.println("EC8381 Fundamentals Of Data Structures In C  Laboratory");
		G7=s.next();
		g7=gradepro.grade(G7);
		System.out.println("BM8411 Integrated Circuits Laboratory");
		G8=s.next();
		g8=gradepro.grade(G8);
		gpa=(g1*4+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2)/23;
		return gpa;
	}
	public static double sem5()
	{
		System.out.println("5th sem grade");
		System.out.println("EC8394 Analog and  Digital Communication");
		G1=s.next();
		g1=gradepro.grade(G1);
		System.out.println("BM8501 Biocontrol Systems");
		G2=s.next();
		g2=gradepro.grade(G2);
		System.out.println("BM8502 Biomedical Instrumentation");
		G3=s.next();
		g3=gradepro.grade(G3);
		System.out.println("EC8553 Discrete Time Signal processing");
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
		System.out.println(" BM8511 Biomedical Instrumentation Laboratory ");
		G8=s.next();
		g8=gradepro.grade(G8);
		System.out.println("HS8381 Interpersoal Skills/Listening &Speaking ");
		G9=s.next();
		g9=gradepro.grade(G9);
		gpa=(g1*3+g2*4+g3*3+g4*4+g5*3+g6*3+g7*2+g8*2+g9*1)/25;
		return gpa;
	}
	public static double sem6()
	{
		System.out.println("6th sem grade");
		System.out.println("EC8691 Microprocessors And Microcontrollers");
		G1=s.next();
		g1=gradepro.grade(G1);
		System.out.println("BM8601 Diagnostic And Therapeutic Equipment - 1");
		G2=s.next();
		g2=gradepro.grade(G2);
		System.out.println("BM8651 Biomechanics ");
		G3=s.next();
		g3=gradepro.grade(G3);
		System.out.println("GE8291 Environmental Science And Engineering ");
		G4=s.next();
		g4=gradepro.grade(G4);
		System.out.println(" MD8091 Hospital Management");
		G5=s.next();
		g5=gradepro.grade(G5);
		System.out.println(" Professional Elective - 2");
		G6=s.next();
		g6=gradepro.grade(G6);
		System.out.println("EC8681 Microprocessors And Microcontrollers Laboratory ");
		G7=s.next();
		g7=gradepro.grade(G7);
		System.out.println("BM8611 Diagnostic And Therapeutic Equipment Laboratory");
		G8=s.next();
		g8=gradepro.grade(G8);
		System.out.println("BM8612 Mini project ");
		G9=s.next();
		g9=gradepro.grade(G9);
		gpa=(g1*3+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2+g9*1)/23;
		return gpa;
	}
	public static double sem7()
	{
		System.out.println("7th sem grade");
		System.out.println(" BM8701 Diagnostic And Therapeutic Equipment -2");
		G1=s.next();
		g1=gradepro.grade(G1);
		System.out.println(" EC8093 Digital Image processing");
		G2=s.next();
		g2=gradepro.grade(G2);
		System.out.println(" BM8702 Radiological Equipments");
		G3=s.next();
		g3=gradepro.grade(G3);
		System.out.println("BM8703 Rehabilitation Engineering");
		G4=s.next();
		g4=gradepro.grade(G4);
		System.out.println("Professional Elective - 2 ");
		G5=s.next();
		g5=gradepro.grade(G5);
		System.out.println("Open Elective-2");
		G6=s.next();
		g6=gradepro.grade(G6);
		System.out.println(" EC8762  Digital Image processing Laboratory");
		G7=s.next();
		g7=gradepro.grade(G7);
		System.out.println("MD8751 Hospital Training ");
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