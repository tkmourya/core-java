import java.util.ArrayList;
import java.util.Scanner;

public class FacebookClone {
    public static void main(String[] args) {
        // create a list of users
        ArrayList<User> users = new ArrayList<>();

        // create a scanner for reading input
        Scanner scanner = new Scanner(System.in);

        // create a new user
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        User user = new User(name);
        users.add(user);

        // add some friends
        user.addFriend(new User("Alice"));
        user.addFriend(new User("Bob"));
        user.addFriend(new User("Charlie"));

        // create a feed for the user
        Feed feed = new Feed();

        // add some posts to the feed
        feed.addPost(new Post("Alice", "Hello, world!"));
        feed.addPost(new Post("Bob", "I love programming!"));
        feed.addPost(new Post("Charlie", "Check out my new photo."));

        // display the feed
        for (Post post : feed.getPosts()) {
            System.out.println(post.getAuthor() + ": " + post.getContent());
        }
    }
}

class User {
    private String name;
    private ArrayList<User> friends;

    public User(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public void addFriend(User friend) {
        this.friends.add(friend);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<User> getFriends() {
        return this.friends;
    }
}

class Feed {
    private ArrayList<Post> posts;

    public Feed() {
        this.posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }

    public ArrayList<Post> getPosts() {
        return this.posts;
    }
}

class Post {
    private String author;
    private String content;

    public Post(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getContent() {
        return this.content;
    }
}
