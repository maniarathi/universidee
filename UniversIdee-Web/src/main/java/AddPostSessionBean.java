package sessionBeans;

import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.ejb.Remote;
import javax.ejb.Local;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import entityBeans.PostEntity;
import entityBeans.UserEntity;


@Stateless

public class AddPost {
	@PersistenceContext(unitName="universidee")

	EntityManager em;

	public void addPost(String content, int rating, String username) {
		boolean IsComment = false;
		int UID = 0;
		Query query = em.createNativeQuery
				("select UID from User where username like '"+username+"'", UserEntity.class );
        UID= (Integer) query.getResultList().get(0);
		String Time = CurrentTime();
		String Date = CurrentDate();
		
	    try {
	    	PostEntity newEntity = new PostEntity();
	    	newEntity.setContent(content);
	    	newEntity.setDate(CurrentDate());
	    	newEntity.setIsComment(false);
	    	newEntity.setRating(rating);
	    	newEntity.setTime(CurrentTime());
	    	newEntity.setUID(UID);
	    	em.persist(newEntity);
		}catch(Exception e){
            throw new EJBException(e);
		}
	}
	public String CurrentTime(){
		Calendar cal= Calendar.getInstance();
		//cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(cal.getTime());
	}
	public String CurrentDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());
	}

}
