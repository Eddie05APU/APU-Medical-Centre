
package medcentre;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SignUpPage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SignUpPage.class.getName());
    
    // user txt file
    private final String USERS_FILE = "users.txt";
    
    public SignUpPage() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        contact_label = new javax.swing.JLabel();
        pw_label = new javax.swing.JLabel();
        name_input = new javax.swing.JTextField();
        email_input = new javax.swing.JTextField();
        contact_input = new javax.swing.JTextField();
        pw_input = new javax.swing.JPasswordField();
        signup_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SignupPage");

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up for APU Medical Centre");

        name_label.setText("Full Name:");

        email_label.setText("Email:");

        contact_label.setText("Contact:");

        pw_label.setText("Password:");

        signup_button.setText("Sign Up");
        signup_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_buttonActionPerformed(evt);
            }
        });

        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pw_label, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pw_input, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(contact_label, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(contact_input, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(email_input, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(signup_button)
                        .addGap(18, 18, 18)
                        .addComponent(back_button)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_input, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contact_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact_input, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pw_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pw_input, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup_button)
                    .addComponent(back_button))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signup_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_buttonActionPerformed
        String name = name_input.getText().trim();
        String email = email_input.getText().trim();
        String password = new String(pw_input.getPassword()).trim();
        String contact = new String(contact_input.getText()).trim();

        if (name.isEmpty() || email.isEmpty() || contact.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            clearAllFields();
            return;
        }
        // pw not match
//        if (!password.equals(confirm)) {
//            JOptionPane.showMessageDialog(this, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
//            pw_input.setText("");
//            confirm_input.setText("");
//            return;
//        }

        if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(this, "Invalid email format! Please use a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
            email_input.setText("");
            return;
        }

        if (password.length() < 5) {
            JOptionPane.showMessageDialog(this, "Password must be at least 5 characters long!", "Error", JOptionPane.ERROR_MESSAGE);
            pw_input.setText("");
            return;
        }
        
        // Validate and format contact
        String checkedContact = validateAndFormatContact(contact);
        if (checkedContact == null) {
            JOptionPane.showMessageDialog(this, "Invalid contact number! Must be 10 or 11 digits (e.g., 0101234567 or 01012345678).", "Error", JOptionPane.ERROR_MESSAGE);
            contact_input.setText("");
            return;
        }
        
        // Check for duplicates
        if (isDuplicateUser(email, checkedContact)) {
            JOptionPane.showMessageDialog(this, "Email or contact already exists. Try different details.", "Sign Up Failed", JOptionPane.ERROR_MESSAGE);
            email_input.setText("");
            contact_input.setText("");
            return;
        }
        
        // generate the next userID
        int nextUserID = getNextUserID();

        // Save to file
        boolean signUpSuccess = saveUserToFile(nextUserID, name, email, checkedContact, password);
        if (signUpSuccess) {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a 'on' EEEE, MMMM dd, yyyy");
            String currentTime = sdf.format(new Date());
            JOptionPane.showMessageDialog(this, "Welcome, " + name + "! Your account (ID: " + nextUserID + ") was created successfully at " + currentTime + ". Please login.", "Success", JOptionPane.INFORMATION_MESSAGE);
            new LoginPage().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "An error occurred while saving your account.", "Sign Up Failed", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_signup_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        new LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_buttonActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JTextField contact_input;
    private javax.swing.JLabel contact_label;
    private javax.swing.JTextField email_input;
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField name_input;
    private javax.swing.JLabel name_label;
    private javax.swing.JPasswordField pw_input;
    private javax.swing.JLabel pw_label;
    private javax.swing.JButton signup_button;
    // End of variables declaration//GEN-END:variables

    private void clearAllFields() {
        name_input.setText("");
        email_input.setText("");
        contact_input.setText("");
        pw_input.setText("");
    }

    // remove non-digits and ensure valid 10 or 11 digits contact number.
    // returns cleaned string or null if invalid.
    private String validateAndFormatContact(String contact_raw) {
        if (contact_raw == null) return null;
        // remove spaces, hyphens, parentheses, plus signs etc.
        String cleaned = contact_raw.replaceAll("[^0-9]", "");
        if (cleaned.matches("\\d{10,11}")) {
            return cleaned;
        }
        return null;
    }

    // Check duplicates by scanning users.txt. Format used: name,email,contact,password
    private boolean isDuplicateUser(String email, String checkedContact) {
        File file = new File(USERS_FILE);
        if (!file.exists()) return false; // no users yet

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) continue;
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String savedEmail = parts[1].trim();
                    String savedContact = parts[2].trim();
                    if (savedEmail.equalsIgnoreCase(email) || savedContact.equals(checkedContact)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error reading users file", e);
        }
        return false;
    }

    // Get next user ID by scanning file for last ID
    private int getNextUserID() {
        File file = new File(USERS_FILE);
        int lastID = 0;
        if (!file.exists()) return 1;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) continue;
                String[] parts = line.split(",");
                if (parts.length >= 1) {
                    try {
                        int currentID = Integer.parseInt(parts[0].trim());
                        if (currentID > lastID) {
                            lastID = currentID;
                        }
                    } catch (NumberFormatException e) {
                        logger.log(Level.WARNING, "Skipping invalid ID line: " + line, e);
                    }
                }
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error reading users file", e);
        }
        return lastID + 1;
    }

    // Save user to file (append). Format: id,name,email,contact,password
    private boolean saveUserToFile(int id, String name, String email, String contact, String password) {
        File file = new File(USERS_FILE);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileWriter fw = new FileWriter(file, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(id + "," + name + "," + email.toLowerCase() + "," + contact + "," + password);
            }
            return true;
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error saving user", e);
            return false;
        }
    }
}
