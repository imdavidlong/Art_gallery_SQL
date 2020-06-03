SELECT cid FROM customer;

SELECT cid FROM customer;

SELECT * FROM saleArtwork;

INSERT INTO saleArtwork(aid,art_name,art_type,price,a_status)
VALUE ('"+a+"','"+b+"','"+c+"',"+d+",'"+e+"');

INSERT INTO artwork_name(artist_id, a_name, a_type, ​created_date​)
 VALUE ('"+a+"','"+b+"','"+c+"','"+d+"');

INSERT INTO artist(artist_id, first_name, last_name) 
VALUE ('"+a+"','"+b+"','"+c+"');

DELETE FROM artwork_name 
WHERE a_name = '"+a+"'and a_type = '"+b+"';

UPDATE  artwork_name  
SET ​created_date​ = "+a+"
WHERE a_name = "+b+"and a_type = "+c+";

SELECT distinct b.Event_name, count(*)
FROM customer c, buy_ticket_name b
WHERE c.cid=b.cid
GROUP BY b.Event_name
HAVING COUNT(*)>= ALL(SELECT Count(*)
                      FROM customer c, buy_ticket_name b
                     WHERE c.cid=b.cid
                     GROUP BY b.Event_name);

SELECT * from artist;

SELECT an.a_name,an.a_type,a.first_name
FROM artwork_name an, artist a
WHERE an.artist_id=a.artist_id;

SELECT event_name, start_date,end_date,address 
FROM manage_event_locate;

SELECT * 
FROM artGallery;

SELECT s.art_type, min(s.price),max(s.price)
FROM saleArtwork s
WHERE s.a_status = 'On Sell'
GROUP BY s.art_type;

SELECT "+ what +" 
FROM " + from + ";

SELECT "+what+" 
FROM "+from+" 
WHERE "+ event_name=+ ""+where+";

SELECT * 
FROM buy_ticket_name 
WHERE cid=" + this.cid + ";

SELECT * 
FROM buy_ticket_name 
WHERE cid="+this.cid +";

SELECT phone, first_name, last_name 
FROM customer 
WHERE cid = "+this.cid+";

UPDATE customer
SET pword = "+ a +"
WHERE cid = "+this.cid+";
