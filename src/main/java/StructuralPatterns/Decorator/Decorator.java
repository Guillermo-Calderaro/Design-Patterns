package StructuralPatterns.Decorator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Decorator extends VisualComponent {

    private VisualComponent visualComponent;

}
