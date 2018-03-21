---
layout: examHandoutNoName
num: e01
ready: true
desc: "Handout C"
qtr: W18
---

<style>
 body { font-size: 72%;
 line-height: 102%;

}

 td  {
  padding-left:5px; padding-right: 5px;
}
</style>


{% highlight java linenos %}
public class Dog {
    
    private static Dog bestInShow = null;
    private String name;
    
    public static void setBestInShow(Dog b) {
	bestInShow = b;
    }
    
    public static Dog getBestInShow() {
	return bestInShow;
    }
    
    public Dog(String name) { this.name = name;}
    
    public static void main(String [] args) {
	
	Dog d1 = new Dog("Ace");
	Dog d2 = new Dog("Buddy");
	Dog d3 = new Dog("Coco");
	Dog d4 = new Dog("Daisy");
	Dog d5 = new Dog("Eddie");
	Dog d6 = d2;   
	
	setBestInShow(d4);       
	d4 = d1;                 
	d2 = d3;                 
	d6 = null;               
	d5 = null;               
	d4 = null;               
	d3 = null;               
	d2 = null;               
	d1 = null;               
	setBestInShow(null);     
    }
}
{% endhighlight %}


