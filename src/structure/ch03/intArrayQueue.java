package structure.ch03;

public class intArrayQueue {

	private int[] array;
	private int front; // 큐의 시작 지점
	private int rear; // 큐의 끝 지점
	private int capacity; // 큐의 용량
	private int size; // 요소의 갯수

	public intArrayQueue(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	// 편의 기능 만들어 보기
	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	// todo -1 데이터 넣기 기능 구현
	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("큐 메모리 공간 부족");
		} else {
			rear++; // 0 <-- 첫 동작시)
			array[rear] = item; // array[0] = item
			size++;
		}
	}

	// todo -2 데이터 꺼내기
	public int dequeue() {
		int item = -99999;

		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없음");
		} else {
			// 잠시 데이터 꺼내 보기
			item = array[front]; // 0번째 요소에 접근
			for (int i = front; i < rear; i++) {
				array[i] = array[i + 1];
			}
			// 마지막 요소를 초기화 처리 한다.
			array[rear] = 0;
			rear--;
			size--;
		}
		return item;
	}

	// todo -3 데이터 찾기 (peek)
	public int peek() {
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없습니다.");
			return -9999;
		} else {
			return array[front];
		}
	}

	public static void main(String[] args) {
		intArrayQueue queue = new intArrayQueue(3);

		// 데이터 넣기
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);

		// 데이터 꺼내고 삭제 처리
		System.out.println(queue.peek());
		System.out.println(queue.dequeue()); // 맨 처음 들어온 녀석부터 꺼내지고 삭제 처리 된다.

	}
}
