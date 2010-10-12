package scrum.client.impediments;

import scrum.client.collaboration.EmoticonsWidget;
import scrum.client.common.ABlockWidget;
import scrum.client.common.AScrumAction;
import scrum.client.common.BlockHeaderWidget;
import scrum.client.common.BlockWidgetFactory;
import scrum.client.dnd.TrashSupport;
import scrum.client.img.Img;
import scrum.client.journal.ActivateChangeHistoryAction;

import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class ImpedimentBlock extends ABlockWidget<Impediment> implements TrashSupport {

	private SimplePanel statusIcon;
	private Anchor dateLabel;

	@Override
	protected void onInitializationHeader(BlockHeaderWidget header) {
		Impediment impediment = getObject();
		dateLabel = header.insertPrefixLabel("70px", true);
		statusIcon = header.insertPrefixIcon();
		header.appendCell(new EmoticonsWidget(impediment), null, true, true, null);
		header.addMenuAction(new ActivateChangeHistoryAction(impediment));
		header.addMenuAction(new CloseImpedimentAction(impediment));
		header.addMenuAction(new DeleteImpedimentAction(impediment));
	}

	@Override
	protected void onUpdateHeader(BlockHeaderWidget header) {
		Impediment impediment = getObject();
		header.setDragHandle(impediment.getReference());
		Image statusImage = null;
		if (impediment.isOpen()) {
			statusImage = Img.bundle.impOpen().createImage();
			statusImage.setTitle("Still impeding.");
		}
		statusIcon.setWidget(statusImage);
		dateLabel.setText(impediment.getDate().toString());
		header.setCenter(impediment.getLabel());
	}

	@Override
	protected Widget onExtendedInitialization() {
		return new ImpedimentWidget(getObject());
	}

	@Override
	public AScrumAction getTrashAction() {
		return new DeleteImpedimentAction(getObject());
	}

	public static final BlockWidgetFactory<Impediment> FACTORY = new BlockWidgetFactory<Impediment>() {

		@Override
		public ImpedimentBlock createBlock() {
			return new ImpedimentBlock();
		}

	};

}
