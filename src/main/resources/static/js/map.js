$(function() {
    function setVotes(biden,trump) {
        setBidenVotes(biden);
        setTrumpVotes(trump);
        var total = biden + trump;
        var bidenRatio;
        if(total == 0) {
            bidenRatio = 50;
            $('#sb-biden').css("width",bidenRatio + "%");
            $('#sb-trump').css("width",(100 - bidenRatio) + "%");
        }else {
            bidenRatio = Math.floor((biden / total) * 100);
            $('#sb-biden').css("width",bidenRatio + "%");
            $('#sb-trump').css("width",(100 - bidenRatio) + "%");
        }
    }
    function setBidenVotes(votes) {
       $('span#biden-votes').text(prependDigits(votes));
    }
    function setTrumpVotes(votes) {
       $('span#trump-votes').text(prependDigits(votes));
    }
    function setPercentages(biden,trump) {
        var total = biden + trump;
        var bidenRatio;
        if(total == 0) {
            bidenRatio = 50;
            $('span#biden-percentage').text(bidenRatio + "%");
            $('span#trump-percentage').text((100 - bidenRatio) + "%");
        }else {
            bidenRatio = Math.floor((biden / total) * 100);
            $('span#biden-percentage').text(bidenRatio + "%");
            $('span#trump-percentage').text((100 - bidenRatio) + "%");
        }
    }
    function prependDigits(num) {
        if(num > 999) return "err";
        if(num > 99) return num.toString();
        var d1, d2;
        d1 = num % 10;
        d2 = (num % 100 - d1) / 10;
        return "0" + d2.toString() + d1.toString();
    }
});