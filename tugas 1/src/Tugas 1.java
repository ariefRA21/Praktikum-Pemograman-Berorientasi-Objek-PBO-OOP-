
import java.util.ArrayList;

class Driver {
  public static void main(String[] args) {
    Account AriefAccount = new Account("Arief");
    Account ErinAccount = new Account("Erin");
    
    AriefAccount.sendMessage(AriefAccount, "Assalamu'alaikum Erin");
    ErinAccount.sendMessage(ErinAccount, "Wa'alaikumsalam Arief");
    
    AriefAccount.showInbox();
    ErinAccount.showInbox();
  }
}

class Account {
  private String name;
  private ArrayList<Message> inbox;

  public Account(String name) {
    this.name = name;
    this.inbox = new ArrayList<Message>(); 
  }

  public String getName() {
    return name;
  }
  
  public void showInbox() {
    for (Message i : inbox) {
        i.showMessage();
    }
  }
  
  public void receiveMessage(Account sender, String message) {
    inbox.add(new Message(sender, message));
  }
  
  public void sendMessage(Account receiver, String message) {
    receiver.receiveMessage(this, message);
  }
}

class Message {
  private String message;
  private Account account;

  public Message(Account account, String message) {
    this.account = account;
    this.message = message;
  }

  public void showMessage() {
    System.out.println(this.account.getName() + ": " + message);
  }
}

