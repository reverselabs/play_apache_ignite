package cz.tomascejka.learn.apacheignite;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;

public class IgniteNodeStartup2 {
	
	public static void main(String[] args) {
		Ignite ignite = Ignition.start("ignite-example.xml");
		
		// Get cache with given name, if it does not exist.
		IgniteCache<Integer, String> cache = ignite.cache(IgniteProperties.ORG_CACHE);
		System.out.println(cache.get(1));
	}
}
