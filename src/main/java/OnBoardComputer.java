public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;
        if (status.getAltitude() > 7500) burn = 100;
        if (status.getAltitude() <= 7500 && status.getVelocity() >= 200) burn = 200;
        if (status.getAltitude() <= 7500 && status.getVelocity() < 200) burn = 100;

        if (status.getAltitude() <= 2000 && status.getVelocity() >= 200) burn = 200;
        if (status.getAltitude() <= 2000 && status.getVelocity() <= 200) burn = 150;
        if (status.getAltitude() <= 2000 && status.getVelocity() <= 150) burn = 100;

        if (status.getAltitude() <= 500 && status.getVelocity() >= 100) burn = 200;
        if (status.getAltitude() <= 500 && status.getVelocity() >= 50) burn = 150;
        if (status.getAltitude() <= 500 && status.getVelocity() <= 50) burn = 100;

        if (status.getAltitude() <= 200 && status.getVelocity() >= 100) burn = 200;
        if (status.getAltitude() <= 200 && status.getVelocity() >= 50) burn = 150;
        if (status.getAltitude() <= 200 && status.getVelocity() <= 50) burn = 110;

        if (status.getAltitude() <= 100 && status.getVelocity() >= 25) burn = 110;
        if (status.getAltitude() <= 100 && status.getVelocity() <= 10) burn = 100;

        if (status.getAltitude() <= 75 && status.getVelocity() >= 10) burn = 110;
        if (status.getAltitude() <= 75 && status.getVelocity() <= 5) burn = 100;

        if (status.getAltitude() <= 50 && status.getVelocity() >= 8) burn = 110;
        if (status.getAltitude() <= 50 && status.getVelocity() <= 5) burn = 100;

        if (status.getAltitude() <= 20 && status.getVelocity() > 1) burn = 102;
        if (status.getAltitude() <= 20 && status.getVelocity() < 1) burn = 99;
        if (status.getVelocity() == 0) burn = 97;

        
        System.out.println(burn); /*hack!*/
        return burn;
    }

}
