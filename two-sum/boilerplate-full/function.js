
	##USER_CODE_HERE##
		
  const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
  const size = Number(input.shift());
const nums = input.shift().split(' ').map(Number);
const target = Number(input.shift());
  const result = twoSum(size, nums, target);
  console.log(JSON.stringify(result));
      