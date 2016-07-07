
public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String simMobileNumber) {

		if (simMobileNumber.length() == 10 && simMobileNumber.substring(0, 2).equals("08")) {
			for (int i = 2; i < simMobileNumber.length(); i++) {
				if (simMobileNumber.charAt(i)>=0 && simMobileNumber.charAt(i)<=9){
					hasSimCard = true;
					this.simMobileNumber = simMobileNumber;
				}
				
			}

		} else {
			System.out.println("Invalid mobile number!");
			hasSimCard = false;

		}
	}

	void removeSimCard() {

		hasSimCard = false;
		this.simMobileNumber = "";
	}

	void call(GSM receiver, int duration) {
		if (!(receiver.hasSimCard) || !hasSimCard) {
			System.out.println("There are no sim card in one of the two phones");
			return;
		}
		if (receiver.simMobileNumber.equals(simMobileNumber)) {
			System.out.println("Numbers is the same");
			return;
		}
		if (duration <= 0) {
			System.out.println("Invalid duration");
			return;
		}
		Call currentCall = new Call();

		currentCall.duration = duration;
		currentCall.caller = this;
		currentCall.receiver = receiver;

		this.outgoingCallsDuration += duration;
		this.lastOutgoingCall = currentCall;
		receiver.lastIncomingCall = currentCall;

	}

	double getSumForCall() {
		return lastOutgoingCall.priceForAMinute * outgoingCallsDuration;
	}
	void printInfoForTheLastOutgoingCall() {

		if (lastOutgoingCall != null) {

			System.out.println("Last Outgoing Call Info");
			System.out.println("Duration : " + lastOutgoingCall.duration);
			System.out.println("Price for minute : " + lastOutgoingCall.priceForAMinute + " lv.");
			System.out.println("Receiver number : " + lastOutgoingCall.receiver.simMobileNumber);

		}
	}

	void printInfoForTheLastIncomingCall() {

		if (lastIncomingCall != null) {

			System.out.println("Last Incomming Call Info");
			System.out.println("Duration : " + lastIncomingCall.duration);
			System.out.println("Price for minute : " + lastIncomingCall.priceForAMinute + " lv.");
			System.out.println("Caller number : " + lastIncomingCall.caller.simMobileNumber);

		}
	}
}
