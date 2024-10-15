package com.aki.designPattern.behavioral.observer;

public class ObserverTest {

    public static void main(String[] args) {

        Blog blog = new Blog("Aki's Blog") ;

        BlogUser blogUser1 = new BlogUser("Mike Observer") ;
        BlogUser blogUser2 = new BlogUser("Amy Observer") ;

        // Erect the relationships :
        blog.registerObserver(blogUser1);
        blog.registerObserver(blogUser2);

        blogUser1.setObserveSubject(blog);
        blogUser2.setObserveSubject(blog);

        // Situation 1 With no new post :
        System.out.println("Article title : " + blogUser1.getArticleTitle());

        System.out.println();

        // Situation 2 With new post :
        blog.postArticle("This is me") ;
        System.out.println("Article title : " + blogUser1.getArticleTitle());
    }
}
