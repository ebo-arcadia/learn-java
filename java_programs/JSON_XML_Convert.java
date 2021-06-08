// JSON - javascript object notation
// key value pairs form of data
// XML - extensible markup language 
// gson - convert java object to json string or vice versa
// JAXB - javascript architecture for XML binding


JsonReader reader = new JsonReader();
reader.beginObject();
while (reader.hasNext()) {
	String name = reader.nextName();
	if (name.equals("key")) {
		String value = reader.nextString();
	}
}
reader.endObject();

package java_programs;

public class JSON_XML_Convert {
    
}

// object relation
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<root>
	<department>
		<roles>
			<role id="1">
				<position>head</position>
				<salary>10k</salary>
			</role>
			<role id="2">
				<position>manager</position>
				<salary>8k</salary>
			</role>
			<role id="3">
				<position>employee</position>
				<salary>5k</salary>
			</role>
		</roles>
		<persons>
			<person id="1">
				<name>Red</name>
				<role>1</role>
			</person>
			<person id="2">
				<name>Green</name>
				<role>2</role>
			</person>
			<person id="3">
				<name>Blue</name>
				<role>2</role>
			</person>
			<person id="4">
				<name>Yellow</name>
				<role>3</role>
			</person>
			<person id="5">
				<name>Brown</name>
				<role>3</role>
			</person>
		</persons>
	</department>
</root>


@XmlRootElement(name = "role")
public class Role {

	private String id;
	private String position;
	private String salary;

	public Role() {
		super();
	}

	public Role(String id, String position, String salary) {
		super();
		this.id = id;
		this.position = position;
		this.salary = salary;
	}

	@XmlAttribute(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(name = "position")
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@XmlElement(name = "salary")
	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
}

public XMLModel getObjectFromXmlFile(String filePath) {
	try {
		File file = new File(filePath);
		JAXBContext jaxbContext = JAXBContext.newInstance(XMLModel.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		XMLModel root = (XMLModel) jaxbUnmarshaller.unmarshal(file);

		return root;
	} catch (JAXBException e) {
		e.printStackTrace();
		return null;
	}
}

// xml to json service

public void writeDataToJsonFile(String filePath, List<Role> roles, List<Person> persons) {
	try {
		JsonWriter writer = new JsonWriter(new FileWriter(filePath));

		writer.setIndent("    ");

		writer.beginObject();

		writer.name("roles");

		writer.beginArray();

		for (Role role : roles) {
			writer.beginObject();

			writer.name("id").value(role.getId());
			writer.name("position").value(role.getPosition());
			writer.name("salary").value(role.getSalary());

			writer.name("persons");

			writer.beginArray();

			for (Person person : persons) {
				if (person.getRole().equalsIgnoreCase(role.getId())) {
					writer.beginObject();

					writer.name("id").value(person.getId());
					writer.name("name").value(person.getName());

					writer.endObject();
				}
			}

			writer.endArray();

			writer.endObject();
		}

		writer.endArray();

		writer.endObject();

		writer.close();
	} catch (IOException e) {

	}
}

// XMLService.
public void parseObjectToXml(String filePath, XMLModel xmlModel) {
	try {
		JAXBContext contextObj = JAXBContext.newInstance(XMLModel.class);

		Marshaller marshallerObj = contextObj.createMarshaller();
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		marshallerObj.marshal(xmlModel, new FileOutputStream(filePath));
	} catch (JAXBException je) {
		System.out.println("JAXBException");
	} catch (IOException ie) {
		System.out.println("IOException");
	}
}