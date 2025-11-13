import java.util.LinkedList;

// 符合老師投影片：class MyStack<T> extends LinkedList<T>
class MyStack<T> extends LinkedList<T> {

    // 把元素放到 Stack 最上面（用 LinkedList 的尾巴當「頂端」）
    public void push(T item) {
        this.addLast(item);
    }

    // 從 Stack 最上面取出元素並回傳
    public T pop() {
        return this.removeLast();
    }

    // Stack 是否為空（這裡其實可以不用 override，但依照老師給的函式名稱寫一次）
    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    // 目前 Stack 裡有幾個元素
    @Override
    public int size() {
        return super.size();
    }
}


// 我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------
