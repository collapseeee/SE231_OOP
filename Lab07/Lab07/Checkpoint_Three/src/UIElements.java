class UIElements {
    public class Button extends UIControl {
        private String label;

        public Button(String label) {
            this.label = label;
        }

        @Override
        public void draw() {
            System.out.println("Drawing Button with label `" + label + "`.");
        }

        @Override
        public void handleEvent(String event) {
            if (event.equalsIgnoreCase("click")) {
                System.out.println("Button `" + label + "` clicked.");
            }
        }

        @Override
        public String getName() {
            return "Button";
        }
    }

    public class TextBox extends UIControl {
        private String text;

        public TextBox(String text) {
            this.text = text;
        }

        @Override
        public void draw() {
            System.out.println("Drawing TextBox with current text `" + text + "`.");
        }

        @Override
        public void handleEvent(String event) {
            if (event.equalsIgnoreCase("textChange")) {
                System.out.println("TextBox text changed to `" + text + "`.");
            }
        }

        @Override
        public String getName() {
            return "TextBox";
        }
    }

    public class ColorPicker extends UIControl {
        private String color;

        public ColorPicker(String color) {
            this.color = color;
        }

        @Override
        public void draw() {
            System.out.println("Drawing ColorPicker with selected color `" + color + "`.");
        }

        @Override
        public void handleEvent(String event) {
            if (event.equalsIgnoreCase("colorSelected")) {
                System.out.println("ColorPicker color changed to `" + color + "`.");
            }
        }

        @Override
        public String getName() {
            return "ColorPicker";
        }
    }
}