package BehavioralPatterns.Visitor.visitor;

import BehavioralPatterns.Visitor.shapes.Circle;
import BehavioralPatterns.Visitor.shapes.CompoundShape;
import BehavioralPatterns.Visitor.shapes.Dot;
import BehavioralPatterns.Visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
