package chapters.chapter_04;

public class Exercises04_03 {

	public static void main(String[] args) {
		double radius = 6371.01;
		
		double atlantaX1 = 33.753746;
		double atlantaY1 = -84.386330;
		double orlandoX2 = 28.538336;
		double orlandoY2 = -81.379234;
		double savannahX3 = 37.076176;
		double savannahY3 = -81.088371;
		double charlotteX4 = 35.227085;
		double charlotteY4 = -80.843124;
		
		double d1AtlOrl = radius * Math.acos(
				Math.sin(Math.toRadians(atlantaX1)) *
				Math.sin(Math.toRadians(orlandoX2)) + 
				Math.cos(Math.toRadians(atlantaX1)) * 
				Math.cos(Math.toRadians(orlandoX2)) * 
				Math.cos(Math.toRadians(atlantaY1 - orlandoY2)));
		double d2AtlSav = radius * Math.acos(
				Math.sin(Math.toRadians(atlantaX1)) *
				Math.sin(Math.toRadians(savannahX3)) + 
				Math.cos(Math.toRadians(atlantaX1)) * 
				Math.cos(Math.toRadians(savannahX3)) * 
				Math.cos(Math.toRadians(atlantaY1 - savannahY3)));
		double d3SavOrl = radius * Math.acos(
				Math.sin(Math.toRadians(savannahX3)) *
				Math.sin(Math.toRadians(orlandoX2)) + 
				Math.cos(Math.toRadians(savannahX3)) * 
				Math.cos(Math.toRadians(orlandoX2)) * 
				Math.cos(Math.toRadians(savannahY3 - orlandoY2)));
		double d4AtlChrl = radius * Math.acos(
				Math.sin(Math.toRadians(atlantaX1)) *
				Math.sin(Math.toRadians(charlotteX4)) + 
				Math.cos(Math.toRadians(atlantaX1)) * 
				Math.cos(Math.toRadians(charlotteX4)) * 
				Math.cos(Math.toRadians(atlantaY1 - charlotteY4)));
		double d5SavChrl = radius * Math.acos(
				Math.sin(Math.toRadians(savannahX3)) *
				Math.sin(Math.toRadians(charlotteX4)) + 
				Math.cos(Math.toRadians(savannahX3)) * 
				Math.cos(Math.toRadians(charlotteX4)) * 
				Math.cos(Math.toRadians(savannahY3 - charlotteY4)));
		
		double s1 = (d1AtlOrl + d2AtlSav +d3SavOrl) / 2;
		double area1 = Math.sqrt(s1 * (s1 - d1AtlOrl) * (s1 - d2AtlSav) * (s1 - d3SavOrl));
		double s2 = (d2AtlSav + d4AtlChrl + d5SavChrl) / 2;
		double area2 = Math.sqrt(s2 * (s2 - d2AtlSav) * (s2 - d4AtlChrl) * (s2 - d5SavChrl));
		double area = area1 + area2;
		System.out.println("The estimated area enclosed by these four cities is: " + area);
	}

}
