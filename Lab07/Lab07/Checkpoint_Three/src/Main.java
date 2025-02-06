public class Main {
    static class UIPanel {
        private UIControl[] controls;

        public UIPanel(UIControl[] controls) {
            this.controls = controls;
        }

        public void drawAll() {
            for (UIControl control : controls) {
                control.draw();
            }
        }
    }
    public static void main(String[] args) {
    UIControl[] controls = new UIControl[3];// Create UI elements
        controls = new UIControl[]{
                new UIElements().new Button("Draw"),
                new UIElements().new TextBox("Hello"),
                new UIElements().new ColorPicker("Black")
        };

        // Create UIPanel and draw all controls
        UIPanel panel = new UIPanel(controls);
        panel.drawAll();

        // Simulate user interactions
        controls[0].handleEvent("click");  // Button Click
        controls[1].handleEvent("textChange");  // Text Change
        controls[2].handleEvent("colorSelected");  // Color Picker Selection

        // Redraw UI after interactions
        panel.drawAll();

    }
}