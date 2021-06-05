package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long,Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review r1 = new Review(1L,"The Quran","/images/fatiha.jpg","Quran","Chapter 103 : Al-Asr, Verses: 1 — 3\n" +
                " \n\n By the ˹passage of˺ time! (1) Surely humanity is in ˹grave˺ loss, (2) except those who have faith, do good, and urge each other to the truth, and urge each other to perseverance. (3)" );
        Review r2 = new Review(2L,"Sahih Bukhari","/images/sahih-al-bukhari.jpg","Sunnah","Narrated Ibn 'Abbas:\n" +
                "\n" +
                "The Prophet (ﷺ) used to invoke Allah at night, saying, \"O Allah: All the Praises are for You: You are the Lord of the Heavens and the Earth. All the Praises are for You; You are the Maintainer of the Heaven and the Earth and whatever is in them. All the Praises are for You; You are the Light of the Heavens and the Earth. You are the Truth, and Your Word is the Truth, and Your Promise is the Truth, and the Meeting with You is the Truth, and Paradise is the Truth, and the (Hell) Fire is the Truth, and the Hour is the Truth. O Allah! I surrender myself to You, and I believe in You and I depend upon You, and I repent to You and with You (Your evidences) I stand against my opponents, and to you I leave the judgment (for those who refuse my message). O Allah! Forgive me my sins that I did in the past or will do in the future, and also the sins I did in secret or in public. You are my only God (Whom I worship) and there is no other God for me (i.e. I worship none but You).\"\n" );
        Review r3 = new Review(3L,"Sahih Muslim","/images/Sharh-Sahih-Muslim-set.jpg","Sunnah","Abu Huraira reported:\n" +
                "\n" +
                "One day the Messenger of Allah (ﷺ) appeared before the public so a man came to him and then said: He said: Messenger of Allah, what is al-Islam? He replied: Al-Islam is that you worship Allah and do not associate anything with Him and you establish obligatory prayer and you pay the obligatory alms (Zakat) and you observe the fast of Ramadan. Prophet of Allah, what is Iman? Upon this he (the Holy Prophet) replied: That you affirm your faith in Allah, His angels, His Books, His meeting, His Messengers and that you affirm your faith in the Resurrection hereafter. He said: Messenger of Allah, what is al-Ihsan? He replied: That you worship Allah as if you are seeing Him, and for if you fail to see Him. He said: Messenger of Allah, when is the Hour (of Doom)? He replied: The one who is asked about it is no better informed than the inquirer, however I will narrate some of its signs to you. When the slave-girl will give birth to her master, then that is from its signs. When the naked, barefooted would become the chiefs of the people, then that is from its signs. When the shepherds of the black (camels) would exult themselves in buildings, then that is from its signs. (The Hour is) Among one of the five which no one knows but Allah. Then he recited (the verse): \"Verily Allah! with Him alone is the knowledge of the Hour and He it is Who sends down the rain and knows that which is in the wombs. And no soul knows what it shall earn tomorrow, and a soul knows not in what land it shall die. Verily Allah is Knowing, Aware.\"\n" +
                "\n" +
                "He (Abu Huraira) said: Then the person turned back and went away. The Messenger of Allah (ﷺ) said: Bring that man back to me. They went to bring him back, but they saw nothing there. Upon this the Messenger of Allah remarked: he was Gabriel, who came to teach the people their religion.");

        reviewList.put(r1.getId(), r1);
        reviewList.put(r2.getId(), r2);
        reviewList.put(r3.getId(), r3);
    }

    public ReviewRepository(Review ...reviewToAdd){
        for (Review review : reviewToAdd) {
            reviewList.put(review.getId(), review);
        }
    }

    public Collection<Review> findAll(){
        return reviewList.values();
    }

    public Review findOne(long id){
        return reviewList.get(id);
    }
}
