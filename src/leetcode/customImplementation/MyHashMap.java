package leetcode.customImplementation;

class HashMapMain{
	public static void main(String[] args) {
		MyHashMap<Integer, String> myHashMap=new MyHashMap<>();
		myHashMap.put(1, "Raghib");
		myHashMap.put(2, "Mayank");
		myHashMap.put(3, "Yuvraj");
		myHashMap.printAll();
		System.out.println(myHashMap.get(1));
	}
}

public class MyHashMap<K,V> {

	private static class Node<K,V>{	
		K key;
		V value;
		Node<K, V> next;
		public Node(K key,V value){
			this.key=key;
			this.value=value;
		}
		
	}
    private Node<K,V>[] buckets;
	private static int capacity=16;
	public MyHashMap() {
		buckets=new Node[capacity];
	}
	
	public int getIndex(K key) {
		int idx=key.hashCode() % capacity;
		return idx;
	}
	
	public void put(K key, V value) {
		
		int index = getIndex(key);
		Node<K, V> head = buckets[index];
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next; // pointing to next node
		}
		Node<K, V> newNode=new Node<>(key,value);
		newNode.next=buckets[index];  // linking new node with already present nodes
		buckets[index]=newNode; // now old nodes not directly point to buckets it is now linked with new nodes 
	}
	
	public V get(K key) {
		int index = getIndex(key);
		Node<K, V> node = buckets[index];
		while(node!=null) {
			if(node.key.equals(key)) {
				return node.value;
			}
			node=node.next;
		}
		return null;
	}
	
	public void printAll() {
		for (int i = 0; i < buckets.length; i++) {
			Node<K, V> head = buckets[i];
			while(head!=null) {
	            System.out.println("Key = " + head.key + ", Value = " + head.value);
				head=head.next;
			}
		}
	}
	
}
