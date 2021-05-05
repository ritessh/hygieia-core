package com.capitalone.dashboard.model.score.settings;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QComponentAlert is a Querydsl query type for ComponentAlert
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QComponentAlert extends BeanPath<ComponentAlert> {

    private static final long serialVersionUID = 728463308L;

    public static final QComponentAlert componentAlert = new QComponentAlert("componentAlert");

    public final EnumPath<ScoreThresholdSettings.ComparatorType> comparator = createEnum("comparator", ScoreThresholdSettings.ComparatorType.class);

    public final NumberPath<Double> value = createNumber("value", Double.class);

    public QComponentAlert(String variable) {
        super(ComponentAlert.class, forVariable(variable));
    }

    public QComponentAlert(Path<? extends ComponentAlert> path) {
        super(path.getType(), path.getMetadata());
    }

    public QComponentAlert(PathMetadata metadata) {
        super(ComponentAlert.class, metadata);
    }

}

