package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public MainFrame() {
        // Thiết lập tiêu đề và kích thước của JFrame
        setTitle("Ứng dụng quản lý chi tiêu");
        setSize(400, 800); // Kích thước ví dụ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo CardLayout và mainPanel
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Thêm các màn hình vào mainPanel
        mainPanel.add(new HomePanel(), "Home");
        mainPanel.add(new CalendarPanel(), "Calendar");
        mainPanel.add(new ReportPanel(), "Report");
        mainPanel.add(new MorePanel(), "More");

        // Thêm các thành phần chính vào JFrame
        add(mainPanel, BorderLayout.CENTER);
        add(createBottomNavigationBar(), BorderLayout.SOUTH);

        // Thiết lập hiển thị
        setLocationRelativeTo(null); // Đặt cửa sổ ở giữa màn hình
        setVisible(true);
    }

    private JPanel createBottomNavigationBar() {
        // Tạo một JPanel để làm thanh điều hướng
        JPanel bottomNavBar = new JPanel();
        bottomNavBar.setLayout(new FlowLayout(FlowLayout.CENTER));
        bottomNavBar.setBackground(Color.BLUE);

        // Tạo các nút và thêm chúng vào thanh điều hướng
        JButton inputButton = new JButton("Nhập vào");
        JButton calendarButton = new JButton("Lịch");
        JButton reportButton = new JButton("Báo cáo");
        JButton moreButton = new JButton("Khác");

        bottomNavBar.add(inputButton);
        bottomNavBar.add(calendarButton);
        bottomNavBar.add(reportButton);
        bottomNavBar.add(moreButton);

        // Thêm ActionListener cho các nút để thay đổi màn hình
        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Home");
            }
        });

        calendarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Calendar");
            }
        });

        reportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Report");
            }
        });

        moreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "More");
            }
        });

        return bottomNavBar;
    }

    public static void main(String[] args) {
        // Chạy ứng dụng
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}
