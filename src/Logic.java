import java.util.ArrayList;

public class Logic {

    public int bidNumber;
    public int auctionHouse;
    public int photoID;
    public final static int BID_RANGE = 100000;
    public final static int AUCTION_RANGE = 90;
    public final static int PHOTO_RANGE = 4;

    ArrayList urlList = new ArrayList();




    public String incrementUrl(){

            auctionHouse = 0;
            bidNumber = 0;
            photoID = 0;
            String url = "lol";
            boolean run = true;


            while (run){
                photoID++;
                if(photoID == PHOTO_RANGE){
                    bidNumber++;
                    photoID = 0;
                    if(bidNumber ==BID_RANGE){
                        auctionHouse++;
                        bidNumber = 0;
                        if(auctionHouse == AUCTION_RANGE){
                        run = false;
                    }}
                }
                url = "http://p3.aleado.com/pic?system=auto&date=2018-03-13&auct=" + auctionHouse +"&bid="+ bidNumber + "&number=" + photoID;
                urlList.add(url);
            }
        return url;
    }
}




