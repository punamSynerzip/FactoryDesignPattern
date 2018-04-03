package com.design.patterns.FactoryDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class OperatingSystemFactoryDesign {
	//static Map typeMap = new HashMap();
		static Map<String, OeratingSystemType> osTypeMap = new HashMap<String, OeratingSystemType>();
		
		static
		{
		osTypeMap.put("AndroidOS", OeratingSystemType.Android);
		osTypeMap.put("IOS", OeratingSystemType.IOS);
		osTypeMap.put("WindowsOS", OeratingSystemType.Windows);
		}
		
		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter OS name to get the configuration details");
			System.out.println("1. AndroidOS\n2. IOS\n3. WindowsOS");
			String osType = br.readLine();
			
			try {
				OperatingSystem os = osTypeMap.get(osType).getOperatingSystem();
				os.specification();
			} catch (NullPointerException e) {
				System.out.println("No such Operating System found");
				e.printStackTrace();
			}
			
			
			

		}
}
