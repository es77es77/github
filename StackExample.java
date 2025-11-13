import java.util.LinkedList;

// 使用 JCF 的 LinkedList 來實作自己的 Stack（不使用 java.util.Stack）
class MyStack<T> extends LinkedList<T> {

    // 放入一個元素到 Stack 最上面（用 LinkedList 的尾巴當頂端）
    public void push(T item) {
        addLast(item);
    }

    // 從 Stack 最上面取出元素並回傳
    public T pop() {
        return removeLast();
    }

    // Stack 是否為空
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


//我的Junit測試會測這個Object，這邊以下請不要修改
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
