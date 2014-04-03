package readhtml_play;


import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class main_new 
{

	public static void main(String[] args) throws IOException 
	{
		String name = "";
		String str_imsi = "";
		
		
		Document doc = Jsoup.connect("https://play.google.com/store/apps/collection/topselling_new_free?start=0&num=100").get();
		Elements titles = doc.getElementsByClass("title");
		int i=1;
		for(Element e: titles) 
		{        
			i++;
			if(i>8)
			{
				name = e.text();
				str_imsi = name.replaceAll("", "");
				str_imsi = str_imsi.replaceAll("–", "");
				str_imsi = str_imsi.replaceAll("®", "");
				name = str_imsi;
				System.out.println(name);
			}
		}	
		
	}
}
