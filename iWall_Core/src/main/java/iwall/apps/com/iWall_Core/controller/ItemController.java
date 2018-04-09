package iwall.apps.com.iWall_Core.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iwall.apps.com.iWall_Core.model.Item;

@RestController
public class ItemController {
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/item")
	public Item item() {
		return new Item(counter.incrementAndGet(),"application ws test","web service rest spring boot",100,15.88,"https://upload.wikimedia.org/wikipedia/fr/d/d0/Spring_framework.png");
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/items")
	public List<Item> items(){
		
		List<Item> items = new ArrayList<Item>();
				
		items.add(new Item(counter.incrementAndGet(),"Dymo - S0946350 - LabelManager 160 Étiqueteuse Portable Clavier AZERTY ",
			    "Dymo - S0946350 - LabelManager 160 Étiqueteuse Portable Clavier AZERTY ",			 
			    35.76,
			    29.95,
			    "https://images-na.ssl-images-amazon.com/images/I/81i0CuE5nnL._SY879_.jpg")
				);
		items.add(new Item(counter.incrementAndGet(),"Scholl Velvet Smooth - Râpe électrique aux cristaux marins",
			    "Scholl Velvet Smooth - Râpe électrique aux cristaux marins",			    
			    21.09,
			    21.09,
			    "https://images-na.ssl-images-amazon.com/images/I/81nB5aPoUPL._SL1500_.jpg")
				);
		items.add(new Item(counter.incrementAndGet(),"Clé USB 3.0 Sandisk Ultra Fit (jusqu\'à 150 Mo/s) - 128 Go",
			    "Clé USB 3.0 Sandisk Ultra Fit (jusqu\'à 150 Mo/s) - 128 Go",
			    66.99,
			    33.25,
			    "https://images-na.ssl-images-amazon.com/images/I/616RUc7bjfL._SL1200_.jpg")
				);
		items.add(new Item(counter.incrementAndGet(),
				"Razer BlackWidow Chroma V2 (2017) - Clavier Gaming Mécanique, Rétro-Éclairage RGB - Yellow Switch (Linéraire et Silencieux) - AZERTY-Layout",
			    "Razer BlackWidow Chroma V2 (2017) - Clavier Gaming Mécanique, Rétro-Éclairage RGB - Yellow Switch (Linéraire et Silencieux) - AZERTY-Layout",
			    148.99,
			    188.99,
			    "https://images-na.ssl-images-amazon.com/images/I/61o0i8PO-nL._SL1024_.jpg")
				);
		items.add(new Item(counter.incrementAndGet(),"Tournevis Stanley Cushion Grip Phillips PH 0 x 60 mm",
			    "Tournevis Stanley Cushion Grip Phillips PH 0 x 60 mm",
			    26.2,
			    0.97,
			    "https://images-na.ssl-images-amazon.com/images/I/51YUbng9JJL._SL1500_.jpg")
				);
		items.add(new Item(counter.incrementAndGet(),"Casque Sans-fil Plantronics Backbeat Pro 2 Noir - Bluetooth/NFC",
			    "Casque Sans-fil Plantronics Backbeat Pro 2 Noir - Bluetooth/NFC",
			    158.66,
			    185,
			    "https://images-na.ssl-images-amazon.com/images/I/71%2BIZZprWML._SL1000_.jpg")
				);
		return items;
	}
}
