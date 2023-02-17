const numberbtn = document.querySelector('.btn-number button')
let waitingNum = document.querySelector('.lastNum h1')
const callBtn = document.querySelector('.counters button')
let callNum = document.querySelector('.counters h1')

callBtn.addEventListener('click', counterUp)
numberbtn.addEventListener('click', countUp);

function countUp() {
    waitingNum.innerHTML ++;
}

function counterUp() {
    callNum = waitingNum;
}