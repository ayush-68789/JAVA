1. )   to use HashMAp       -->       import java.util.HashMap ;               or simply use this -->  imnport java.util.* ;

2. )   to make a new hashmap     ==>    HashMap <String , Integer> var_name = new HashMap<>() ;

3. )   to insert a key Value pair        -->          var_name.put(key , value) ;
                
                public static void main(String[] args) 
	              {
		                  HashMap <String, Integer> map = new HashMap <>() ;
		                  map.put("Piyush", 0) ;
		                  map.put("ayush",1) ;
		                  System.out.println(map);
	              }

o/p : {ayush=1, Piyush=0}        // wits means they are unordered 


4. )   to search a key     -->      var_name.containsKey(name_of_key) ;               returns true if contains else returns false

                if(map.containsKey("ayush"))
		            {
		                  System.out.print("Present");   
		            }

5. )   to get the value of the specific key      -->       var_name.get(name_of_key) ;       

                System.out.print(map.get("Piyush"));     o/p - 0 
                System.out.print(map.get("aksh"));       o/p - null


6. )   Iteration in HashMaps : 

		a.) For Iterating to get both key and value ---> 
			
			for(Map.Entry<String, Integer> x : map.entrySet())
	    		{
	        		System.out.println(x.getKey());
	       			System.out.println(x.getValue());
	    		}

		b.) For iterating just to get key ---> 

			for(String x : map.keySet())
	    		{
	        		System.out.println(x);
	        		System.out.println(map.get(x));
	    		}



7. )   To remove the key and value from Hashmap  		-->		var_name.remove(key_name) ;   
									it will remove the key and the value corresponding to it



8. )   To find the size of the map      -->       var_name.size()      
		            
