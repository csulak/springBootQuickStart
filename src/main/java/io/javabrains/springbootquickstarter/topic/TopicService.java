package io.javabrains.springbootquickstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("id1", "name1", "description1"),
			new Topic("id2", "name2", "description2"), new Topic("id3", "name3", "description3")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);

	}

	public void updateTopid(Topic topic, String id) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}

	}

	public void deleteTopic(String id) {
		topics.removeIf(topic -> topic.getId().equals(id));
		return;
	}

}