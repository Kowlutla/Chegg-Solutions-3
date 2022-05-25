package procons;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

class TestDataStructures {

	public static void main(String[] args) {

		new TestDataStructures().testLinkedList();
	}

	void testLinkedList() {
		LinkedList<String> list = new LinkedList<String>();
		LinkedListProducer producer = new LinkedListProducer(list);
		LinkedListConsumer consumer = new LinkedListConsumer(list);
		assertEquals(true, list.isEmpty());

		producer.produce("1st");
		producer.produce("2nd");
		producer.produce("3rd");

		assertEquals("1st", consumer.consumeHead());
		assertEquals("3rd", consumer.consumeTail());
		assertEquals("2nd", consumer.consumeTail());
		assertEquals(true, list.isEmpty());
	}

}