package org.anurag.webServices;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out
					.println("Please enter the IP address to find the country");
		} else {
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println("The IP belongs to "+geoIP.getCountryName());
					
		}
		
		

	}
}
