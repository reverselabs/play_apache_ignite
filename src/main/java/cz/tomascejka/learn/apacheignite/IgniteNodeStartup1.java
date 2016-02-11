package cz.tomascejka.learn.apacheignite;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.apache.ignite.cache.CacheAtomicityMode;
import org.apache.ignite.configuration.CacheConfiguration;

public class IgniteNodeStartup1 {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Ignite ignite = Ignition.start("ignite-example.xml");
		
		CacheConfiguration cfg = new CacheConfiguration();
		cfg.setName(IgniteProperties.ORG_CACHE);
		cfg.setAtomicityMode(CacheAtomicityMode.TRANSACTIONAL);

		// Create cache with given name, if it does not exist.
		IgniteCache<Integer, String> cache = ignite.getOrCreateCache(cfg);
		cache.put(1, "Oracle");
	}
}
