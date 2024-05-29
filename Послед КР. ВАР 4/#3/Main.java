import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {

    List<Client> clients = new ArrayList<>();
    clients.add(new Client("Amalia", 70, "Female", List.of(
            new Phone("7953256", Phone.PhoneType.STATSIONAR),                
            new Phone("795325623", Phone.PhoneType.MOBILE)
    )));
    clients.add(new Client("Vlad", 20, "Male", List.of(
            new Phone("795355239", Phone.PhoneType.MOBILE)        
    )));
    clients.add(new Client("Michael", 30, "Male", List.of(                
            new Phone("7953999", Phone.PhoneType.STATSIONAR)
    )));
    clients.add(new Client("Anna", 65, "Female", List.of(
            new Phone("7951234", Phone.PhoneType.STATSIONAR)
    )));
    // 1
    double averAge = clients.stream()
                            .filter(client -> client.getPhones().stream()
                            .anyMatch(phone -> phone.getType() == Phone.PhoneType.STATSIONAR))
                            .mapToInt(Client::getAge)
                            .average()
                            .orElse(0);
    System.out.println("#1  " + averAge);
    // 2
    List<Client> clientsWMobile = clients.stream()
                                         .filter(client -> client.getAge() >= 18)
                                         .filter(client -> client.getPhones().stream()
                                         .anyMatch(phone -> phone.getType() == Phone.PhoneType.MOBILE))
                                         .collect(Collectors.toList());
    System.out.println("#2  " );
        clientsWMobile.forEach(client -> System.out.println(client.getName() + ", " + client.getAge() + " лет, Телефоны: " + client.getPhones()));
    // 3
    boolean SixYFemaleSTATSIONAR = clients.stream()
                                          .anyMatch(client -> client.getGender().equals("Female") && client.getAge() > 60
                                          && client.getPhones().stream()
                                          .anyMatch(phone -> phone.getType() == Phone.PhoneType.STATSIONAR));
    System.out.println("#3  " + SixYFemaleSTATSIONAR);
    // 4
    List<Client> sortedClientsName = clients.stream()
                                            .sorted(Comparator.comparing(Client::getName))
                                            .collect(Collectors.toList());
    System.out.println("#4 по имени");
    sortedClientsName.forEach(client -> System.out.println(client.getName() + ", " + client.getAge() + " лет, Телефоны: " + client.getPhones()));

    List<Client> sortedClientsAge = clients.stream()
                                            .sorted(Comparator.comparing(Client::getAge))
                                            .collect(Collectors.toList());
    System.out.println("#4 по возрасту");
    sortedClientsAge.forEach(client -> System.out.println(client.getName() + ", " + client.getAge() + " лет, Телефоны: " + client.getPhones()));

    }
}