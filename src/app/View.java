package src.app;

public class View extends InPut implements Printer {


    public void print(Message message) {

        String sender = message.getSender();
        String text = message.getText();


        if ((sender == null || sender.isEmpty()) && (text == null || text.isEmpty())) {
            Printer emptyEmpty = new Printer() {
                @Override
                public void print(View.Message message) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };

            emptyEmpty.print(null);

        } else if
        (sender == null || sender.isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення " + text);
        } else if
        (text == null || text.isEmpty()) {
            System.out.println("Користувач " + sender + " відправив пусте повідомлення.");
        } else {
            System.out.println("Користувач " + sender + " відправив повідомлення: " + text);
        }
    }


    public static class Message {

        String sender;
        String text;

        public Message(String sender, String text) {
            this.sender = sender;
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

    }


}


