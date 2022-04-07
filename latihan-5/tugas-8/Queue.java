import java.util.Scanner;
import java.util.ArrayList;

public class Queue {
    ArrayList<Integer> queue = new ArrayList<Integer>();
    int size;
    // jumlah data di dalam queue
    int content;

    public Queue(int size) {
        this.size = size;
        this.content = 0;
    }

    void insert() {
        if (content < size) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Insert masukan angka : ");
            queue.add(keyboard.nextInt());
            content++; 
        } else {
            System.out.println("Maaf, queue full");
        }
        
    }

    void remove() {
        if (!queue.isEmpty()) {
            queue.remove(0);
            System.out.println("Remove berhasil");
            content--;
        } else {
            System.out.println("Remove gagal");
        }
        
    }

    void peek() {
        if (!queue.isEmpty()) {
            System.out.println("Head : " + queue.get(0));
        } else {
            System.out.println("Queue kosong");
        }
    }

    void cekFull() {
        if (content == size) {
            System.out.println("Queue full ");
        } else if (content < size) {
            System.out.println("Queue belum full");
        }
    }

    void cekEmpty() {
        if (queue.isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            System.out.println("Queue tidak kosong");
        }
    }

    void cetakSize() {
        System.out.println("Size : " + size);
    }

    void cetakQueue() {
        System.out.println("\nQueue : " + queue);
    }
    
    void pilihMenu() {
        Scanner keyboard = new Scanner(System.in);
        int selected;
        
        System.out.println("Queue Operations");
        System.out.println("1. Insert");
        System.out.println("2. Remove");
        System.out.println("3. Peek");
        System.out.println("4. Check Empty");
        System.out.println("5. Check Full");
        System.out.println("6. Size");
        
        System.out.print("Your Choice ? ");
        selected = keyboard.nextInt();
        switch (selected) {
            case 1:
            insert();
            break;
            case 2:
            remove();
            break;
            case 3:
            peek();
            break;
            case 4:
            cekEmpty();
            break;
            case 5:
            cekFull();
            break;
            case 6:
            cetakSize();
            break;
            
        }
    }
    
        public static void main(String[] args) {
            int size;
            Boolean lanjut = true;
            String choice;
            Scanner keyboard = new Scanner(System.in);

            System.out.print("Masukan size queue : ");
            size = keyboard.nextInt();
            
            Queue queue = new Queue(size);
            Scanner keyboard2 = new Scanner(System.in);
            while (lanjut) {
                queue.pilihMenu();
                queue.cetakQueue();
                System.out.print("\nDo you want to continue [y/n] ? ");
                choice = keyboard2.nextLine();
                if (choice.equals("y")) {
                    lanjut = true;
                    System.out.println();
                } else {
                    lanjut = false;
                }
            }
            

        }


    
}
