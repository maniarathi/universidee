package sessionBeans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import entityBeans.PostEntity;

/**
 * Session Bean implementation class postAdded
 */
@Stateless
@LocalBean

public class postAdded {
	private  EntityManager em;
    public List<List<String>> postAdded(int UID) {
    	List<List<String>> postsAdded = new ArrayList<List<String>>();
    	String content;
    	int rating;
    	String time;
    	String date;
    	
    	List<PostEntity> posts;
    	Query query = em.createNativeQuery
    				("select * from Post where UID like '"+UID+"' and isComment like 'false'", PostEntity.class );
        posts = query.getResultList();
        int size = posts.size();
        for (int i=0; i<size; i++){
        	List<String> post= new ArrayList<String>();
        	PostEntity pe = new PostEntity();
        	pe = posts.get(i);
        	content = pe.returnContent();
        	rating = pe.returnRating();
        	time = pe.returnTime();
        	date = pe.returnDate();
        	post.add(content);
        	post.add(Integer.toString(rating));
        	post.add(time);
        	post.add(date);
        	postsAdded.add(post);
        }
        return postsAdded;
    	

    }

}
